public class LowerTriangularMatrix {
    public static void printLowerTriangularMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i>=j){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        int [][]arr={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        printLowerTriangularMatrix(arr);
    }
}

// lower triangular matrix
// condition:(i>=j)i is equal to j or i greater than j

// 1 0 0
// 4 5 0 
// 7 8 9
