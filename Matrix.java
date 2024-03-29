import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns : ");
        int columns = scanner.nextInt();

        int[][] originalMatrix = new int[rows][columns];
        int[][] sortedMatrix = new int[rows][columns];
        int[][] adductMatrix = new int[rows][columns];
        int[][] multiMatrix = new int[rows][columns];
        int[] highValue = new int[rows];

        // Input the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(String.format("Enter element %d,%d : ", i + 1, j + 1));
                originalMatrix[i][j] = scanner.nextInt();
                sortedMatrix[i][j] = originalMatrix[i][j]; // Copy for sorting
            }
        }

        // Sort each row of the sorted matrix using bubble sort
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns - 1; j++) {
                for (int k = 0; k < columns - j - 1; k++) {
                    if (sortedMatrix[i][k] > sortedMatrix[i][k + 1]) {
                        int temp = sortedMatrix[i][k];
                        sortedMatrix[i][k] = sortedMatrix[i][k + 1];
                        sortedMatrix[i][k + 1] = temp;
                    }
                }
            }
        }

        // Print the original matrix
        System.out.println("The Original Matrix is : ");
        printMatrix(originalMatrix);

        // Print the sorted matrix
        System.out.println("The Sorted Matrix is : ");
        printMatrix(sortedMatrix);

        // Add the original and sorted matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                adductMatrix[i][j] = originalMatrix[i][j] + sortedMatrix[i][j];
            }
        }

        // Print the adduct matrix
        System.out.println("The Adduct Matrix is : ");
        printMatrix(adductMatrix);

        // Multiply the original and sorted matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < rows; k++) {
                    multiMatrix[i][j] += originalMatrix[i][k] * sortedMatrix[k][j];
                }
            }
        }
        System.out.println("The Multiplied Matrix is : ");
        printMatrix(multiMatrix);

        // Find the row with the highest value
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                highValue[i] += adductMatrix[i][j];
            }
        }

        int rowIndexWithMaxValue = 0;
        int maxValue = highValue[0];
        for (int i = 1; i < rows; i++) {
            if (highValue[i] > maxValue) {
                maxValue = highValue[i];
                rowIndexWithMaxValue = i;
            }
        }
        System.out.println();
        System.out.println(String.format("Row with the highest value is : %d", rowIndexWithMaxValue + 1));
        System.out.println();

        scanner.close();
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}
