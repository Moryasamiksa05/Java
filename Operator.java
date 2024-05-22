import java.util.Scanner;

public class Operator {//Arithmetic operator
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); 
        //  int a = 23;
        //  int b = 28;
        //  int sum = a + b ;//Binary operator
        //  System.out.println( "Add = " + sum);

        //  //unary Operator
        //   int c = 10;
        //   int j = ++c;
        //   System.out.println(c);
        //   System.out.println(j);


        //Relational Operator
            //  int a =10;
            //  int b =56;
             
            //  System.out.println(a==b);
            //  System.out.println(a!=b);
            //  System.out.println(a>b);
            //  System.out.println(a<b);
            //  System.out.println(a>=b);
            //  System.out.println(a<=b);
            
            //Logical Operator
           
            // System.out.println( (2>0) && (0<9));
            // System.out.println( (2<0) || (0<9));
            // System.out.println( !(2<0) );//logical NOT

            //Assignment Operator

            int a = 10;
             a+= 8;
            System.out.println(a);
            int b = 10;
            b-= 8;
           System.out.println(b);
           int n = 10;
           n*= 8;
          System.out.println(n);
          int k = 10;
          k/= 8;
         System.out.println(k);
         
          
           
    }
}
