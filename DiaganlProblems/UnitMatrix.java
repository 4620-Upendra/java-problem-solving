public class UnitMatrix {
     public static boolean checkUnitMatrix(int arr[][]){
        if(arr.length!=arr[0].length){
            return false;
        }
        boolean unitMatrix=true;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i!=j){
                    if(arr[i][j]!=0){
                        unitMatrix=false;
                    }
                }
                else if(arr[i][j]!=1){
                    unitMatrix=false;
                }
            }
        }
        return unitMatrix;
    }
    public static void main(String[] args) {
        int arr[][]={{1,0,0},{0,1,0},{0,0,1}};
        // int arr[][]={{1,0,0},{0,1,0},{0,0,2}};
        // int arr[][]={{1,0},{0,1,0},{0,0,1}};
        System.out.println("given matrix is unit matrix:"+checkUnitMatrix(arr));
    }
}
