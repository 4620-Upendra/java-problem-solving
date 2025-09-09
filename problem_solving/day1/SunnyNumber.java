// Definition
// A Sunny Number is a number n such that n + 1 is a perfect square.
// In other words, if adding 1 to the number gives you a perfect square, then that number is called a sunny number.
// Examples
// 1)8
// 8+1=9
// 9 is a perfect square (3*3 or 3^2)
// ✅ So, 8 is a sunny number.
//2) 24
// 24+1=25
// 25 is a perfect square (5*5 or 5^2).
// ✅ So, 24 is a sunny number.
// 3)10
// 10+1=11
// 11 is not a perfect square.
// ❌ So, 10 is not a sunny number.

import java.util.Scanner;

public class SunnyNumber {
    public static boolean checkPerfectSquare(int n){
        for(int i=1;i<n/2;i++){
            if(i*i==n){
                return true;
            }
        }
        return false;
    }
    public static boolean checkSunnyNumber(int n){
        if(checkPerfectSquare(n+1)){
            return true;
        }
        else{
            return false;
        }
    }
   public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=s.nextInt();
        System.out.println("given number is Sunny number:"+checkSunnyNumber(n));
   } 
}
