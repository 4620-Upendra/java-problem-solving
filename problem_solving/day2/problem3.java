// sum of even index values in given array 
public class problem3 {
    public static int sumOfEvenIndexValues(int arr []){
        int sumOfEIV=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sumOfEIV+=arr[i];
            }
        }
        return sumOfEIV;
    }
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6};
        System.out.println("sum of even index values in given array:"+sumOfEvenIndexValues(arr));
    }
}
