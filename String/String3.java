import java.util.*;
public class String3 {
    public static boolean checkPalindrome(String str){ //O(n)
        for(int i =0;i<str.length()/2;i++){
            int n =str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
               return false;
            }
        }
        return true;
           }
    public static void main(String[] args) {
        String str = new String();
        str = "sa";
        System.out.println(checkPalindrome(str));
    }
}
