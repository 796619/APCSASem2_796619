public class bubbleSort{
    public static void main(String[] args){
        int myArray[] = new int[10];
        int numSwaps = 0;
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = (int)(Math.random()*10);
        }
        for(int d = 0; d < myArray.length; d++){
            System.out.print(myArray[d] + " ");
        }    
        System.out.println();
        for(int j = 0; j < myArray.length-1; j++){
            for(int i = 0; i < myArray.length-j-1; i++){
                if(myArray[i] > myArray[i+1]){
                    int temp = myArray[i];
                    myArray[i] = myArray[i+1];
                    myArray[i+1] = temp;
                    numSwaps++;
                }    
            }           
        }
        System.out.println("Number of swaps = " + numSwaps);
        for(int x = 0; x < myArray.length; x++){
            System.out.print(myArray[x] + " ");

        }
        System.out.println();
    }
}