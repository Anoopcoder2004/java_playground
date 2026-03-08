public class Recursion {

    public static void printNum(int n){
        if(n==0){//base case
            return ;
        }
        System.out.println(n);
        n--;
        printNum(n);
    }
    public static void main(String args[]){
        int n = 5;
        printNum(n);
    }
}