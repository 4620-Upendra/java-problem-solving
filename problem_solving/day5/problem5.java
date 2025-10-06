// 5. Find average of array elements
// Input:
// [10, 20, 30, 40]
// Output:
// Average = 25.0

import java.util.Arrays;

public class problem5 {
    public static float  avgOfElements(int[] arr){
        return (Arrays.stream(arr).reduce(0, (a,b)->a+b))/arr.length;
    }
    public static void main(String[] args) {
        System.out.println("the average of given array elements:"+avgOfElements(new int []{10,20,30,40}));
    }
}
