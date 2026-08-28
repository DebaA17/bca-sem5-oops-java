public class EvenOddStats {
    public static void main(String[] args) {
        int evenSum = 0, evenCount = 0;
        int oddSum = 0, oddCount = 0;

        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            if (num % 2 == 0) {
                evenSum += num;
                evenCount++;
            } else {
                oddSum += num;
                oddCount++;
            }
        }

        System.out.println("Even Numbers - Sum: " + evenSum + ", Average: " + ((double) evenSum / evenCount));
        System.out.println("Odd Numbers - Sum: " + oddSum + ", Average: " + ((double) oddSum / oddCount));
    }
}
