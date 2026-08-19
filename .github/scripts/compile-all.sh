#!/usr/bin/env bash

set -eo pipefail

RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
BLUE='\033[0;34m'
NC='\033[0m'

echo -e "${BLUE}=======================================${NC}"
echo -e "${BLUE}   Java Compilation CI Check Started   ${NC}"
echo -e "${BLUE}=======================================${NC}"

mapfile -t JAVA_DIRS < <(find . -name "*.java" -not -path "*/.*" -exec dirname {} + | sort -u)

if [ ${#JAVA_DIRS[@]} -eq 0 ]; then
  echo -e "${YELLOW}Warning: No Java files found in the repository.${NC}"
  exit 0
fi

FAILED=0
SUCCESS_COUNT=0
FAILURE_COUNT=0

TEMP_OUT=$(mktemp -d)
trap 'rm -rf "$TEMP_OUT"' EXIT

for dir in "${JAVA_DIRS[@]}"; do
  echo -e "\n${BLUE}Checking directory: ${dir}${NC}"
  
  mapfile -t FILES < <(find "$dir" -maxdepth 1 -name "*.java")
  
  if [ ${#FILES[@]} -eq 0 ]; then
    continue
  fi
  
  echo "Compiling ${#FILES[@]} Java file(s)..."
  for file in "${FILES[@]}"; do
    echo "  - $(basename "$file")"
  done
  
  if javac -d "$TEMP_OUT" "${FILES[@]}"; then
    echo -e "${GREEN}✓ Compile successful for ${dir}${NC}"
    SUCCESS_COUNT=$((SUCCESS_COUNT + 1))
  else
    echo -e "${RED}✗ Compile FAILED for ${dir}${NC}"
    FAILED=1
    FAILURE_COUNT=$((FAILURE_COUNT + 1))
  fi
done

echo -e "\n${BLUE}=======================================${NC}"
echo -e "${BLUE}            Check Summary              ${NC}"
echo -e "${BLUE}=======================================${NC}"
echo -e "Total directories checked: ${#JAVA_DIRS[@]}"
echo -e "Successful compilations:   ${GREEN}${SUCCESS_COUNT}${NC}"
echo -e "Failed compilations:       ${RED}${FAILURE_COUNT}${NC}"
echo -e "${BLUE}=======================================${NC}"

if [ $FAILED -ne 0 ]; then
  echo -e "${RED}Result: CI compilation check FAILED. Please fix the compilation errors above.${NC}"
  exit 1
else
  echo -e "${GREEN}Result: All Java files compiled successfully! 🎉${NC}"
  exit 0
fi
