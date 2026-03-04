import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String word = sc.nextLine();
        String result = "";
        for(int i = 0; i<word.length();i++){
            if(word.charAt(i)=='e'){
                result+="i";
            }else{
                result+=word.charAt(i);
            }
        }
        System.out.println(result);

    }
}
