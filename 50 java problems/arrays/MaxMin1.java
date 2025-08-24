// 1.	Find max and min element

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the size of array :");
        int size=s.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            System.err.print("enter the "+i+" index element of array :");
            arr[i]=s.nextInt();
        }
        // int max=Integer.MIN_VALUE;
        // int min=Integer.MAX_VALUE;
        int max=arr[0];
        int min=arr[0];
        for(int i:arr){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        System.out.println("the min value is "+min+" and the max value is "+max+" in the given "+Arrays.toString(arr));
        s.close();
    }
}
