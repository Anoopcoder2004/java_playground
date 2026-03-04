import java.util.*;

public class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
        System.out.println("Enter the number of cols");
        int m = sc.nextInt();
        System.out.println("Enter " + (n * m) + "elements :");
        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Entered matrix is :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println("The spiral order matrix is :");

        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = m - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {

            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;

            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;
            if (rowStart <= rowEnd) {
                for (int col = colEnd; col >= colStart; col--) {
                    System.out.print(matrix[rowEnd][col] + " ");
                }
                rowEnd--;
            }
            if (colStart <= colEnd) {
                for (int row = rowEnd; row >= rowStart; row--) {
                    System.out.print(matrix[row][colStart] + " ");
                }
                colStart++;
            }

        }

    }
}