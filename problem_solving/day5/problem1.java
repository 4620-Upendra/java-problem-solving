// 1. Find the largest element in an array
// Input:
// [10, 20, 5, 8, 30]
// Output:
// Largest = 30
// Explanation: Traverse and keep track of max.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class problem1{
    public static int largestElement(Integer arr[]){
        List<Integer> list =Arrays.asList(arr);
        return Collections.max(list);
    }
    public static void main(String [] args){
        System.out.println("the largest element in given array:"+largestElement(new Integer[]{10,20,5,8,301}));
    }
}