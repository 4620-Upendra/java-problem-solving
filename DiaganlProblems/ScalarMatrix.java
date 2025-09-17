public class ScalarMatrix {
    public static boolean checkScalarMatrix(int arr[][]){
        if(arr.length!=arr[0].length){
            return false;
        }
        boolean scalarMatrix=true;
        int diagonalElement=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i!=j){
                    if(arr[i][j]!=0){
                        scalarMatrix=false;
                    }
                }
                else if(arr[i][j]!=diagonalElement){
                    scalarMatrix=false;
                }
            }
        }
        return scalarMatrix;
    }
    public static void main(String[] args) {
        int arr[][]={{20,0,0},{0,20,0},{0,0,20}};
        // int arr[][]={{20,0,0},{0,20,0},{20,0,20}};
        System.out.println("given matrix is scalar matrix:"+checkScalarMatrix(arr));
    }
}
