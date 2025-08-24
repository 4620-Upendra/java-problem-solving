
import java.util.Scanner;

// 10.	Find missing number in array (1 to n)

// 3. Step-by-step logic
// Find the expected sum using the formula:
// 1)Sum from 1 to n=𝑛*(n+1)/2 
// 2)Find the actual sum of the numbers in the array.
// 3)Subtract the actual sum from the expected sum → that’s the missing number.


public class MissingNumber10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter n value:");
        int n=s.nextInt();
        System.out.print("enter the size of array:");
        int size=s.nextInt();
        int [] arr =new int[size];
        for(int i=0;i<size;i++){
            System.out.print("enter "+i+" index element:");
            arr[i]=s.nextInt();
        }

        int sumOFnumbersUptoN=(n*(n+1))/2;
        int sumOfNumbersInArray=0;
        for(int num:arr){
            sumOfNumbersInArray+=num;
        }
        // System.out.println(sumOfNumbersInArray);
        // System.out.println(sumOFnumbersUptoN);
        int missingNumber=sumOFnumbersUptoN-sumOfNumbersInArray;
        System.out.println("the missing number is "+missingNumber);
        s.close();
    }
}
