import java.util.Arrays;

public class FibonacciSeries{
    public static void printFibonacciSeries(){
        int arr[]=new int[11];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        printFibonacciSeries();
    }
}