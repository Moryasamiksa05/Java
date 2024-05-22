import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        // int  a = sc.nextInt();
        // int  b = sc.nextInt();
        // int  c = sc.nextInt();
        // int avg = a + b + c / 3;
        // System.out.println(avg);
        
        // int  side  = sc.nextInt();
        //  int area = side * side;
        //  System.out.println(area);


        int  pencil  = sc.nextInt();
         int  pen = sc.nextInt();
         int eraser = sc.nextInt();
         float total = pencil + pen + eraser ;
         System.out.println("Bill is: " +  total);
         float NewTotal = total + (0.08f + total);
         System.out.println("Bill with 18% GST Tax : " + NewTotal);
         
        

        byte b =  4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
         double result = (f * d) + (i % c) + (d * s);
         System.out.println(result);



         int $ = 24;
         System.out.println($);

    }
}
