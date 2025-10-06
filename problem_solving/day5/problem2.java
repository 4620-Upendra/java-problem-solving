
// 2. Find the second largest element in an array
// Input:
// [12, 35, 1, 10, 34, 1]
// Output:
// Second Largest = 34
// Explanation: Largest = 35, second largest = 34.

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class problem2 {
    public static Integer secondLargest(Integer[] arr){
        List<Integer>list=Arrays.asList(arr);
        Collections.sort(list);
        return  list.get(list.size()-2);
    }
    public static void main(String[] args) {
        System.out.println("the second largest element in given array:"+secondLargest(new Integer[]{12,35,1,10,34,1}));
    }
}
