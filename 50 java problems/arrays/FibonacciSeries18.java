import java.util.Arrays;
import java.util.Scanner;

// 18.	Print Fibonacci series
// 🔹 Example 1
// Input: 5
// Output: 0 1 1 2 3
public class FibonacciSeries18 {
    public static void printFibonacciSeries(int n){
        int [] arr=new int[n];
        if(n>2){
            arr[0]=0;
            arr[1]=1;
            for(int i=2;i<arr.length;i++){
                arr[i]=arr[i-1]+arr[i-2];
            }
             System.out.println("Fibonacci series:"+Arrays.toString(arr));
        }
        else if(n==2){
            arr[0]=0;
            arr[1]=1;
             System.out.println("Fibonacci series:"+Arrays.toString(arr));
        }
        else if(n==1){
            arr[0]=0;
             System.out.println("Fibonacci series:"+Arrays.toString(arr));
        }else{
             System.out.println("Fibonacci series:"+Arrays.toString(arr));
        }
       
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter number :");
        int num=s.nextInt();
        printFibonacciSeries(num);
    }
}
