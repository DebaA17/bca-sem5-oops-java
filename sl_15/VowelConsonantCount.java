import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine().toLowerCase();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (character >= 'a' && character <= 'z') {
                if (character == 'a' || character == 'e' || character == 'i'
                        || character == 'o' || character == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        scanner.close();
    }
}