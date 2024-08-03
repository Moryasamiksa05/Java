public class Assi3 {
    public static void transposeMatrix(int matrix[][]){
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                int temp =0;
               i=  temp;
               j = i;
               temp = j;
               
            }
           for( i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                System.out.println(matrix[i][j]);
            }
           }
        }
    }
    public static void main(String[] args) {
        int matrix[][] ={{10,20,30,40},
                         {15,25,35,45},
                        {27,29,37,48},{32,33,39,50}};
                        transposeMatrix(matrix);
                        // System.out.println(transposeMatrix(matrix));
       
    }
}
