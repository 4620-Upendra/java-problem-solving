// 17. Find missing number in array (1 to N)
// Input:
// [1, 2, 4, 5, 6], N=6
// Output:
// Missing = 3
// Explanation: Sum formula – array sum.
import java.util.Arrays;
public class problem17 {
    public static int findMissingNumber(int arr[],int n){
        int sumOfNumbersUptoN=(n*(n+1))/2;
        int sumOfEleInArray=0;
        for(int i:arr){
            sumOfEleInArray+=i;
        }
        return sumOfNumbersUptoN-sumOfEleInArray;
    }
    public static void main(String[] args) {
        // int arr[]=new int[]{1,2,3,5,6};
        int arr[]=new int[]{1,2,4,5,6};
        System.out.println("the missing number in given array"+Arrays.toString(arr)+":"+findMissingNumber(arr, 6));
    }
}
