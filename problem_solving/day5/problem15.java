// 15. Rotate an array to the right by 2 positions
// Input:
// [1, 2, 3, 4, 5]
// Output:
// [4, 5, 1, 2, 3]

import java.util.Arrays;

public class problem15 {
    public static int [] changePosition(int arr[],int start,int end){
         while(start<=end){
            int temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
        return arr;
    }
    public static void rotateByRight(int arr[],int position){
        arr=changePosition(arr, 0, arr.length-1);
        arr=changePosition(arr, 0, position-1);
        arr=changePosition(arr, position, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        System.out.print(" Rotate an array to the right by 1 positions:");
        rotateByRight(new int[]{1,2,3,4,5}, 1);
        System.out.print(" Rotate an array to the right by 2 positions:");
        rotateByRight(new int[]{1,2,3,4,5}, 2);
        System.out.print(" Rotate an array to the right by 3 positions:");
        rotateByRight(new int[]{1,2,3,4,5}, 3);
    }
}
