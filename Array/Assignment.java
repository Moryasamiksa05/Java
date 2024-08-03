public class Assignment {
    public static boolean isSame(int nums[]){
        for(int i =0;i<nums.length-1;i++){
            for(int j =i+1;j<nums.length;i++){
                if(nums[i]==nums[j]){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;
        
        

    }

    public static void main(String[] args) {
        int nums[] ={2,2,2,3,2,0,9,7};
        System.out.println(isSame(nums));
    }
}
