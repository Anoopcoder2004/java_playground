import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email:");
        String word = sc.nextLine();
        String userName = "";
        for(int i = 0; i<word.length();i++){
            if(word.charAt(i)=='@'){
                System.out.println(userName);
                return;
            }else{
                userName+=word.charAt(i);
            }
        }

    }
}
