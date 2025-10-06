// 14. Rotate an array to the left by 2 positions
// Input:
// [1, 2, 3, 4, 5]
// Output:
// [3, 4, 5, 1, 2]

import java.util.Arrays;

public class problem14 {
    public static int [] changePosition(int [] arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
        return arr;
    }
    public static void rotateByLeft(int arr[],int position){
        arr=changePosition(arr, 0, arr.length-1);
        // arr=changePosition(arr, 0,arr.length-position-1);
        arr=changePosition(arr, 0,position);
        arr=changePosition(arr, arr.length-position,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        System.out.print(" Rotate of given array to the left by 1 positions:");
        rotateByLeft(new int[]{1,2,3,4,5}, 1);
        System.out.print(" Rotate of given array to the left by 2 positions:");
        rotateByLeft(new int[]{1,2,3,4,5}, 2);
        System.out.print(" Rotate of given array to the left by 3 positions:");
        rotateByLeft(new int[]{1,2,3,4,5}, 3);
    }
}
