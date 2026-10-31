import java.util.Scanner;

public class MatrixOperations {
    static void print(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row)
                System.out.print(value + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] first = new int[2][2];
        int[][] second = new int[2][2];

        System.out.println("Enter first 2x2 matrix:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                first[i][j] = scanner.nextInt();

        System.out.println("Enter second 2x2 matrix:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                second[i][j] = scanner.nextInt();

        int[][] sum = new int[2][2];
        int[][] product = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = first[i][j] + second[i][j];
                for (int k = 0; k < 2; k++)
                    product[i][j] += first[i][k] * second[k][j];
            }
        }

        System.out.println("Addition:");
        print(sum);
        System.out.println("Multiplication:");
        print(product);
        System.out.println("Transpose of first matrix:");
        for (int i = 0; i < 2; i++)
            System.out.println(first[0][i] + " " + first[1][i]);
        scanner.close();
    }
}
