
import java.util.Arrays;
import java.util.Scanner;

public class SumAllEle2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the size of array :");
        int size=s.nextInt();
        int [] arr=new int[size];
        int sum=0;
        for(int i=0;i<size;i++){
            System.err.print("enter the "+i+" index element of array :");
            arr[i]=s.nextInt();
            sum+=arr[i];
        }
        System.out.println("the sum of all elements in "+Arrays.toString(arr)+" is "+sum);

    }
}
