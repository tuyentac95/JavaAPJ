import java.util.Scanner;

public class GetSumOfColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row, col;
        do {
            System.out.print("Enter the rows of matrix: ");
            row = sc.nextInt();
            if (row > 5) {
                System.out.println("The number of rows should be smaller!");
            }
        } while (row > 5);

        do {
            System.out.print("Enter the columns of matrix: ");
            col = sc.nextInt();
            if (col > 5) {
                System.out.println("The number of rows should be smaller!");
            }
        } while (col > 5);

        double[][] matrix = new double[row][col];
        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                System.out.print("Enter the element at position (" + i + ", " + j + ") : ");
                matrix[i][j] = sc.nextDouble();
            }
        }

        for (int i=0; i < matrix.length; i++) {
            for (int j=0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.print("\n");
        }

        System.out.println("Enter the column you need to get sum: ");
        int input_col = sc.nextInt();

        if (input_col < 0 || input_col > col) {
            System.out.println("This column does not exist");
        } else {
            double sum = 0;
            for (int i=0; i < matrix.length; i++) {
                sum += matrix[i][input_col];
            }
            System.out.println("The sum of column " + input_col + " is: " + sum);
        }
    }
}
