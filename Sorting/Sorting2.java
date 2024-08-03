// selection sort
// pick the smllest put it on the begining
// o(n^2)
public class Sorting2 {
    public static void selectionSort(int arr[]){
        for(int i =0;i<arr.length;i++){ //decreasing order  -1
            int minpos = i;
          for(int j=i+1;j<arr.length;j++){
            if(arr[minpos]<arr[j]){
                minpos =j;

            }

          }
        //   swap
        int temp = arr[minpos];
        arr[minpos] = arr[i];
        arr[i] = temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
   public static void main(String[] args) {
    int arr[] ={5,4,3,2,1};
    selectionSort(arr);
    printArr(arr);
   } 
}
