
// optimized approach for finding th sum of the subarrays
// by using a prefix array
public class SubASum {
    public static void FindmaxSum(int number[]){
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        // calculate prefix array
        for(int i =1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + number[i];
        }
        for(int i =1;i<number.length;i++)
            int start =i;
            for(int j =i;j<number.length;j++){
                int end =j;
                currSum = 0;
            }
        }

    }
    public static void main(String[] args) {
        int number[] ={1,-2,6,-1,3};
    }
    
}
