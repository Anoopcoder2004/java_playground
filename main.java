   import java.util.Scanner;
   public class main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter total number:");
            int total = sc.nextInt();
            System.out.println("Enter "+ total + "numbers");
            int [] numbers = new int [total];
            for(int i = 0;i<total;i++){
                numbers[i] = sc.nextInt();
            }
            System.out.println("Enter the number to search:");
            int search = sc.nextInt();
            boolean found = false;
            for(int i = 0;i<total; i++){
                if(numbers[i] == search){
                    found = true;
                    System.out.println("Number found at index: " + i);
                    break;
                }
            }
            if(!found){
                System.out.println("Number not found in the array.");
            }
        }
    }
