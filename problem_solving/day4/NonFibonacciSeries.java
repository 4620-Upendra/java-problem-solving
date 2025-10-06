import java.util.Arrays;

public class NonFibonacciSeries {
    public static void printFibonacciSeries(){
        int arr[]=new int[11];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        int NonFibonacciSeriesIndex=0;
        // Numbers from 1 to 55 → 55 total
        // Fibonacci numbers in that range → 9 (1,2,3,5,8,13,21,34,55)
        // Non-Fibonacci = 55 – 9 = 46 ✅
        int NonFibonacciSeriesEle []=new int[arr[arr.length-1]-(arr.length-2)];
        // int NonFibonacciSeriesEle []=new int[46];
        for(int i=0;i<arr.length;i++){
            if(i+1<arr.length){
                for(int j=(arr[i]+1);j<arr[i+1];j++){
                    if(NonFibonacciSeriesIndex+1<NonFibonacciSeriesEle.length){
                        NonFibonacciSeriesEle[NonFibonacciSeriesIndex++]=j;
                    }
                    else{
                        NonFibonacciSeriesEle[NonFibonacciSeriesIndex]=j;
                    }
                }
            }
        }
        System.out.println("fibonacci series array:"+Arrays.toString(arr));
        System.out.println("non fibonacci series array:"+Arrays.toString(NonFibonacciSeriesEle));
    }
    public static void main(String[] args) {
        printFibonacciSeries();
    }
}
