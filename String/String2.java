import java.util.*;
public class String2 {
    public static void printchar(String str){
        for(int i =0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
   public static void main(String[] args) {
    String str = new String();
    str = "samiksha";
    printchar(str);
   } 
}
