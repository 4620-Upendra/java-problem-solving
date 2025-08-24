// 11.	Find duplicates in array

import java.util.Arrays;
import java.util.Scanner;
public class Duplicates11 {
    public static void findDuplicates(int [] arr){
        boolean duplicatesThere=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                    duplicatesThere=true;
                }
            }
        }
        if(!duplicatesThere){
            System.out.println("in the given array "+ Arrays.toString(arr)+" there are no duplicates");
        }
    }
    public static int [] fillingArray(int size,Scanner s){
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("enter "+i+" index element :");
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int size=s.nextInt();
        int [] arr=fillingArray(size, s);
        findDuplicates(arr);
    }
}
