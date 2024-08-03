public class Assignment5 {
    
        public static void printTriplet(int nums[]){
            for(int i =0;i<nums.length;i++){
                int start = i;
                for(int j = i;j<nums.length;j++){
                    int end = j;
                     for(int k =start;k<=end;k++){
                        if(i!=j || i!=k|| j!=k && i +j+ k == 0){
                            System.out.println("["+i+j+k+"]");
                           
                        }
                       
                              
                    }  
                }     
                    
            }    
        }
        public static void main(String[] args) {
            int nums[] = {-1,0,1,2,-1,-4};
            printTriplet(nums);
            

        }
    
    
}
