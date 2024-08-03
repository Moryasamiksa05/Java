public class linearSearch {
    public static int  linaerseach(int arr[], int key){
        for(int i =0;i<arr.length;i++){
            if(arr[i] == key){
           return i;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[] ={2,4,6,8,10,12,14,16};
        int key =10; 
        int idx = linaerseach(arr, key);
        if(idx == key){
            System.out.println("key found at index"+idx);
        }else{
            System.out.println("key not found");
        }
    }
}
