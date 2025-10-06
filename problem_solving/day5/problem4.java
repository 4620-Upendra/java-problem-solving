// 4. Find sum of array elements
// Input:
// [5, 10, 15, 20]
// Output:
// Sum = 50
// Explanation: Add all numbers.

import java.util.Arrays;

public class problem4 {
    public static int sumOfElements(int[] arr){
        return Arrays.stream(arr).reduce(0, (a,b)->a+b);
    }
    public static void main(String[] args) {
        System.out.println("the sum of elements in given array:"+sumOfElements(new int []{1,2,3,4,5}));
    }
}
