
import java.util.Scanner;

// 16.	Check if a number is strong
// 🔹 What is a Strong Number?
// A Strong number (sometimes called a factorial sum number) is a number in which the sum of the factorial of its digits is equal to the original number.
// 👉 Formula:
// If n = d1 d2 d3 …,
// then check:
// n == (d1! + d2! + d3! + …)
// 🔹 Examples
// 145
// Digits = 1, 4, 5
// 1! + 4! + 5! = 1 + 24 + 120 = 145 ✅ → Strong number
// 2
// Digits = 2
// 2! = 2 ✅ → Strong number
// 123
// Digits = 1, 2, 3
// 1! + 2! + 3! = 1 + 2 + 6 = 9 ❌ → Not strong

public class StrongNumber16 {
    public static int factorial(int n){
        int factorialResult=1;
        for(int i=1;i<=n;i++){
            factorialResult*=i;
        }
        return factorialResult;
    }
    public static void StrongNumber(int n){
        int sumOfFactorial=0;
        String Nvalue=String.valueOf(n);
        for(int i=0;i<Nvalue.length();i++){
            int num=Character.getNumericValue(Nvalue.charAt(i));
            sumOfFactorial+=factorial(num);
        }
        System.out.println(n+" is strong number:"+(sumOfFactorial==n));
    }
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=S.nextInt();
        StrongNumber(n);
    }
}
