public class insertSort{
    public static void main(String[] args){
        int arr[] = {10,34,2,56,7,67,88,42};
        int numSwap = 0;
        for(int i = 1; i < arr.length; i++){           
            if(arr[i] < arr[i-1]){
            for(int j = i; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    numSwap++;
                }
            }
            }
        } 
        System.out.println("Number of Swaps = " + numSwap);
        for(int x = 0; x < arr.length; x++){
            System.out.println(arr[x] + " ");
        }
        System.out.println();
    }    
}
