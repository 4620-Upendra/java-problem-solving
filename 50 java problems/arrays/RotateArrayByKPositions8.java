// 8.Rotate array by K positions  towords right
import  java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByKPositions8{
    public static int [] rotateArray(int [] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
            // System.out.println(start+","+end);
        }
        return arr;
    }
    public static int [] arrayfilling(int n){
        Scanner s=new Scanner(System.in);
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the "+i+" index element of"+" :");
            arr[i]=s.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the array size:");
        int size=s.nextInt();
        int [] arr=arrayfilling(size);
        // int [] arr1=Arrays.copyOf(arr,arr.length);
        int [] arr1=arr.clone();
        System.out.print("enter number of position to rotate:");
        int k=s.nextInt();

        // rotated array by k positions towords right
        arr=rotateArray(arr, 0, arr.length-1);
        arr=rotateArray(arr, k, arr.length-1);
        arr=rotateArray(arr, 0, k-1);
        System.out.println("Rotated array by "+ k+" positions towords right :"+Arrays.toString(arr));
        

        // rotated array by k positions towords left
        arr=rotateArray(arr1, 0, arr.length-1);
        arr=rotateArray(arr1, 0, arr.length-k-1);
        // arr=rotateArray(arr1, 0, 2);
        System.out.println("Rotated array by "+ k+" positions towords left :"+Arrays.toString(arr1));



    }
    
}
