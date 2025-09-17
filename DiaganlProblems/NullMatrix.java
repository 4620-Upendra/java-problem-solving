public class NullMatrix {
    public static boolean checkNullMatrix(int [][] arr){
        boolean nullMatrix=true;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]!=0){
                    nullMatrix=false;
                }
            }
        }
        return nullMatrix;
    }
    public static void main(String[] args) {
        int arr [][]={{0,0,0},{0,0,0},{0,0,0}};
        // int arr [][]={{0,0,0},{0,1,0},{0,0,0}};
        System.out.println("given matrix is null or zero matrix:"+checkNullMatrix(arr));
    }
}
