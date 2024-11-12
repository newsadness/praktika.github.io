import java.util.Random;
import java.util.Scanner;

public class RandomMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размерность матрицы n: ");
        int n = scanner.nextInt();

        double[][] matrix = new double[n][n];

        System.out.println("Исходная матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = -n + random.nextDouble() * (2 * n);
                System.out.print(String.format("%.2f", matrix[i][j]) + "\t");
            }
            System.out.println();
        }

        int[][] roundedMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                roundedMatrix[i][j] = (int) Math.round(matrix[i][j]);
            }
        }

        System.out.println("Округленная матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(roundedMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
