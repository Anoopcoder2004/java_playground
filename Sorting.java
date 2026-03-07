public class Sorting{
    public static void main(String args[]){
        int arr[] = {8,7,5,2,1,3};

        //selection sort 
        for(int i = 0;i<arr.length-1;i++){
            int smallest = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]= temp;
        }
        printArray(arr);
        
    }
    public static void printArray(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}