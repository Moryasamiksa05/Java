import java.util.Scanner;

public class array{
    public static void updatenum(int arr[]) {
        for(int i =0;i<arr.length;i++){
            arr[i] = i+1;
        }
    }
    public static void main(String[] args) {
        int arr[] =new int[90];
        Scanner sc = new Scanner(System.in);
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();
         arr[3]=sc.nextInt();
        arr[4]=sc.nextInt();
        arr[5]=sc.nextInt();
        updatenum(arr);
        for(int i =0;i<arr.length;i++){
        System.out.println("marks is given as: "+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
    }
    System.out.println();
        


    }
}