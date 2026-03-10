public class Recursion {

    public static int CalculateFactorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int factnm1= CalculateFactorial(n-1);
        int  fact = n * factnm1;
        return fact;
    }
public static void main(String[] args) {
    int ans = CalculateFactorial(5);
    System.out.print(ans);
}
}