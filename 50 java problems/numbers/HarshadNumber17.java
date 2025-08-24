// 17.	Check if a number is Harshad
// 🔹 What is a Harshad Number?
// A Harshad number (also called a Niven number) is an integer that is divisible by the sum of its digits.
// 👉 Formula:
// If n is the number,
// Find sum of digits = d1 + d2 + d3 + ...
// If n % (sum of digits) == 0 → Harshad number ✅
// 🔹 Examples
// 18
// Digits = 1 + 8 = 9
// 18 % 9 = 0 ✅ → Harshad number

// 21
// Digits = 2 + 1 = 3
// 21 % 3 = 0 ✅ → Harshad number

// 19
// Digits = 1 + 9 = 10
// 19 % 10 = 9 (not 0) ❌ → Not a Harshad number

import java.util.Scanner;

public class HarshadNumber17 {
    public static void checkHarshad(int n){
        int sumOfDigits=0;
        String Nvalue=String.valueOf(n);
        for(int i=0;i<Nvalue.length();i++){
            int num=Character.getNumericValue(Nvalue.charAt(i));
            sumOfDigits+=num;
        }
        int result=n%sumOfDigits;
        System.out.println(n+" is Harshad number:"+(result==0));
    }
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=S.nextInt();
        checkHarshad(n);
    }
}
