// Inbuilt Sort
// Arrays.sort(arr,si,ei)
// Arrays.sort(arr,Collections.reverseOrder()) int - Integer(object)
// Arrays.sort(arr,si,ei,Collections.reverseOrder())
import java.util.Arrays;

public class Sorting4 {
    public static void printArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={5,4,3,2,1};
    //    Arrays.sort(arr);
    Arrays.sort(arr,0,3);

       printArr(arr);
    }
}
