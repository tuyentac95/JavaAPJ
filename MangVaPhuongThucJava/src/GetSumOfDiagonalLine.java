import java.util.Scanner;

public class GetSumOfDiagonalLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        do {
            System.out.print("Enter the size of matrix: ");
            size = sc.nextInt();
            if (size > 5) {
                System.out.println("The size of matrix should be smaller!");
            }
        } while (size > 5);

        double[][] matrix = new double[size][size];
        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                System.out.print("Enter the element at position (" + i + ", " + j + ") : ");
                matrix[i][j] = sc.nextDouble();
            }
        }

        double sumDiagonal = 0;
        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.print("\n");
            sumDiagonal += matrix[i][i];
        }

        System.out.println("The sum of the main diagonal is " + sumDiagonal);
    }
}
