// 3.	Reverse an array
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray3{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.print("enter the array sixe:");
        int size=s.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("enter the "+i+" index element:");
            arr[i]=s.nextInt();
        }
        int [] result=new int[size];
        for(int i=size-1;i>=0;i--){
            result[arr.length-1-i]=arr[i];
        }
        System.out.println("before reverse:"+Arrays.toString(arr));
        System.out.println("after reverse:"+Arrays.toString(result));
    }
}