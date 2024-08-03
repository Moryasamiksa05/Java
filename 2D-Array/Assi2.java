public class Assi2 {
    public static void printRowSum(int nums[][]){
        int i = 1;
        int sum =0;
        for(int j =0;j<nums[0].length;j++){
            sum+= nums[i][j];
           

        }
        System.out.println("The sum is" + " "+sum);
    }
    public static void main(String[] args) {
        int nums[][] ={{1,4,9},{11,4,3},{2,2,3}};
        printRowSum(nums);

    }
}
