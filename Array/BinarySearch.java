public class BinarySearch {
    public static int binarySearch(int numbers[],int key) {
        int start = 0,end = numbers.length-1;
        while (start<=end) {
            
        
       int mid = (start+end) /2;
       if(numbers[mid]==key){
        return mid;
       }
       else if(key>numbers[mid]){
        start = mid+1;

       }else if(key<numbers[mid]){
        end = mid - 1;
       }
    }
       return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int key = 14;
        System.out.println(binarySearch(numbers,key));

    }
}