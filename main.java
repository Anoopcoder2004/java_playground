import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int numbers[][] = new int [rows][cols];
        System.out.println("Enter "+(rows*cols) + " numbers");
        //input
        for(int i = 0;i < rows; i++){
            for(int j = 0;j< cols;j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Entered number is :");
        // output
         for(int i = 0;i < rows; i++){
            for(int j = 0;j< cols;j++){
                System.out.print(numbers[i][j] + " ");
            }System.out.println();
            }
    }
}