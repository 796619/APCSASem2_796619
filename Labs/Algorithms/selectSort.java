public class selectSort{    
    public static int[] sorter(int[] arr){
        int numSwaps = 0;
        for(int i = 0; i < arr.length - 1; i++){
            int x = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[x]){
                    x = j;
                }
                int smallerNumber = arr[x];
                arr[x] = arr[i];
                arr[i] = smallerNumber;
                numSwaps++;              
            } 
        }
        System.out.println("Number of swaps = " + numSwaps);
        return arr;
    }
    public static void main(String a[]){
        int[] arr1 = {10,32,2,56,7,67,88,42};
        int[] arr2 = sorter(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }    
    }
}    