public class Assi1 {
    public static int printNum(int matrix[][]){
        int count =0;
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length-1;j++){
                if(matrix[i][j]==7){
                i++;
                j++;
                    
                }
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int matrix[][] ={{4,7,8},{8,8,7}};
        System.out.println(printNum(matrix));

    }
}
