public class ColumnMatrix {
    public static boolean checkColumnMatrix(int [][]arr){
        boolean columnMatrix=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i].length!=1){
                columnMatrix=false;
            }
        }
        return columnMatrix;
    }
    public static void main(String[] args) {
        int arr[][]={{1},{2},{3}};
        // int arr[][]={{1},{2},{3,1}};
        System.out.println("given matrix is column matrix:"+checkColumnMatrix(arr));
    }
}
