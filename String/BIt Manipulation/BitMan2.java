
public class BitMan2 {
    public static void checkEvenOrOdd(int num){
        int bitmask = 1;
        if( num *bitmask == 0){
            System.out.println("even");
        }else{
            System.out.println("not even");
        }
    }
public static void main(String[] args) {
   int num = 2;
   checkEvenOrOdd(num);
}    
}
