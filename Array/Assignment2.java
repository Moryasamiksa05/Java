public class Assignment2 {
    public static int findTarget(int nums[],int target){
        int start =0;
        int end = nums.length-1;
        while (start<=end) {
            
        
            int mid = (start+end) /2;
            if(nums[mid]==target){
             return mid;
            }
            else if(target<nums[mid]){
             start = mid-1;
     
            }else if(target>nums[mid]){
             end = mid + 1;
            }
         }
            return -1;

    }
    public static void main(String[] args) {
        int nums[] ={4,5,6,7,0,1,2};
        int target = 9;
        System.out.println(findTarget(nums, target));

        
    }
}
