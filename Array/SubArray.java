public class SubArray {
    public static void subArray(int number[]){
        // int tp =0;
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0;i<number.length;i++){
            int start = i;
            for(int j = i;j<number.length;j++){
                int end = j;
                currSum = 0;
                for(int k =start;k<=end;k++){
                    // System.out.print(number[k]+" ");
                    currSum+= number[k];         
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum = currSum;
                }
                
                // tp++;
                // System.out.println();
               
            
            }
            
         
           
        }
        System.out.println("pairs is"+maxSum);
    }
    public static void main(String[] args) {
        int number[] ={2,4,6,8,10,12,14,16};
        subArray(number);

    }
}
