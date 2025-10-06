// 3. Reverse an array
// Input:
// [1, 2, 3, 4, 5]
// Output:
// [5, 4, 3, 2, 1]
// Explanation: Swap start and end.

import java.util.Arrays;

public class problem3 {
    public static int [] reverseArray(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Reverse of given array:"+Arrays.toString(reverseArray(new int[]{1,2,3,4,5})));
    }
}
