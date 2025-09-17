public class RowMatrix {
    public static boolean checkRowmatrix(int arr[][]){
        if(arr.length!=1){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{1,2,3}};
        // int arr[][]={{1,2,3}};
        System.out.println("given matrix is row matrix:"+checkRowmatrix(arr));
        
    }
}
