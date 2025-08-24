//4.	Check if array is sorted
import java.util.Arrays;
import java.util.Scanner;

public class CheckSortedArray4 {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        System.out.print("enter the array size:");
        int size=s.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("enter the "+i+" index element:");
            arr[i]=s.nextInt();
        }
        boolean isSorted=true;
        for(int i=0;i<size;i++){
            if(i+1<size){
                if(arr[i]>arr[i+1]){
                    isSorted=false;
                    break;
                }
            }
        }
        if(isSorted){
            System.out.println("the give array "+Arrays.toString(arr)+" is sorted");
        }
        else{
            System.out.println("the give array "+Arrays.toString(arr)+" is not sorted");
        }
        s.close();
    }
}
