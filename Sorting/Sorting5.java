// Counting Sort
// range is min - max # some time gives linear time complexity 
// o(n+range) time complex.
public class Sorting5 {
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] =  new int[largest+1];
        for(int i =0;i<arr.length;i++){
            count[arr[i]]++;
        }
        // sorting
        int j =0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
                
                
            }
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
      countingSort(arr);
      printArr(arr);

}
}
