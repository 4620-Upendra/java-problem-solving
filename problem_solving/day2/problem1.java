// 1) sum of elements in array
public class problem1{
    public static int sumOfElements(int arr []){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
    public static void main(String [] args){
        int arr[]={1,2,3,4,5};
        System.out.println("the sum of eleemnets in given array:"+sumOfElements(arr));

    }
}