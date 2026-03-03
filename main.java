import java.util.Scanner;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
            if(arr[i] <min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The minimum element in the array is: " + min);
        System.out.println("The maximum element in the array is: " + max);

    }
}