
import java.util.Arrays;
import java.util.Scanner;

// 5)Write a java program that to Swap First and Last Element of an array ?
public class problem5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the array size:");
        int size=s.nextInt();
        int [] arr= new int[size];
        for(int i=0;i<size;i++){
            System.out.print("enter the "+i+" index element :");
            arr[i]=s.nextInt();
        }
        System.out.println("array before swaping first and last element is "+Arrays.toString(arr));
        int temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        System.out.println("array after swaping first and last element is "+Arrays.toString(arr));
    }
}
