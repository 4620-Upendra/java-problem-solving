public class DiagonalMatrix {
    public static boolean checkDiagonalMatrix(int [][] arr){
        if(arr.length!=arr[0].length){
            return false;
        }
        boolean diagonalMatrix=true;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i!=j){
                    if(arr[i][j]!=0){
                        diagonalMatrix=false;
                    }
                }
            }
        }
        return diagonalMatrix;
    }
    public static void main(String[] args) {
        int arr [][]={{1,0,0},{0,2,0},{0,0,3}};
        // int arr [][]={{1,0,0},{0,2,0},{3,0,3}};
        System.out.println("given matrix is diagonal matrix:"+checkDiagonalMatrix(arr));
    }
}
