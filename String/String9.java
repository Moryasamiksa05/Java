public class String9 {
    public static String toUppercase(String str){//O(n)
        StringBuilder sb = new StringBuilder(" ");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i =1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        
        String str ="samiksha i am a student";
        System.out.println(toUppercase(str));

    }
}
