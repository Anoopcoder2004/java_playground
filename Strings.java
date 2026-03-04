import java.util.*;

public class Strings {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size");
       int size = sc.nextInt();
       int totalLength= 0;
       for (int i = 0; i < size ; i++){
            totalLength +=sc.next().length();
       }
       System.out.println(totalLength);

    }
}
