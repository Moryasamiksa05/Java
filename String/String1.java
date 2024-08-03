import java.util.*;
public class String1 {
    // strings are immutable
    
  public static void main(String[] args) {
    
   String str = new String();
Scanner sc = new Scanner(System.in);
String name;
name = sc.nextLine();
System.out.println(name.length());
// concatination
String firstName = sc.nextLine();
String lastName = sc.nextLine();
String fullName = firstName + "   "+lastName;
System.out.println(fullName);

  }  
}
