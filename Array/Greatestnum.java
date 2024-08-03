
public class Greatestnum {
    public static int greatestnumber(int numbers[]){
        int greatest = Integer.MIN_VALUE;
        for(int i =0;i<numbers.length;i++){
            if(numbers[i]>greatest){
                numbers[i]= greatest;
            }
            System.out.println("greatest number is" + greatest);

        }
        return greatest;
        
        
    }
    public static void main(String[] args) {
        int numbers [] ={7,8,9,4,3,2};
        greatestnumber(numbers);
        // System.out.println(greatestnumber(numbers));

    }
}
