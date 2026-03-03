import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int numbers[][] = new int[rows][cols];

        System.out.println("Enter " + (rows * cols) + " numbers");
        // input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number to find :");
        int target = sc.nextInt();
        System.out.println("Entered number is at index :");
        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == target) {
                    System.out.println("number found at index:"+i+","+j);
                }
            }
        }
    }
}