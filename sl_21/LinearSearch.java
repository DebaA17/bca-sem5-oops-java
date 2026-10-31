import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = scanner.nextInt();
        int position = -1;

        for (int i = 0; i < size; i++) {
            if (numbers[i] == target) {
                position = i;
                break;
            }
        }

        if (position == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at position " + (position + 1));
        scanner.close();
    }
}
