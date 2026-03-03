import java.util.Scanner;
public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of names you want to input:");
        int n = sc.nextInt();
        String[]  names = new String[n];
        System.out.println("Enter the names:");
        for(int i = 0; i< n ;i++){
            names[i] = sc.next();

        }
        System.out.println("The names you entered are:");

        for(int i = 0; i< n ;i++){
            
            System.out.println(names[i]);
        }

    }
}