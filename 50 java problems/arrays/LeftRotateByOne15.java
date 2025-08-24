// 15.	Left rotate by 1 place

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateByOne15 {
    public static int [] rotate(int [] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static int [] leftRotate(int [] arr,int k){
        arr=rotate(arr, 0, arr.length-1);
        // System.out.println(Arrays.toString(arr));
        arr=rotate(arr, 0, arr.length-1-k);
        // System.out.println(Arrays.toString(arr));
        arr=rotate(arr, arr.length-k, arr.length-1);
        // System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("enter the position value to rotate towords left:");
        int k=s.nextInt();
        int [] arr={1,2,3,4,5};
        arr=leftRotate(arr, k);
        System.out.println(Arrays.toString(arr));
        s.close();
    }
}
