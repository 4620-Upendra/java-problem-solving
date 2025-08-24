
import java.util.Scanner;

// 15.	Find power of a number (a^b)
// 🔹 Step-by-Step Explanation
// Let’s say we want 3^4:
// Step 1: Write base = 3, exponent = 4.
// Step 2: Multiply 3 by itself 4 times:
// 3 × 3 × 3 × 3 = 81
// So, 3^4 = 81.
// 🔹 Special Rules
// a^0 = 1 (except when a = 0).
// Example: 9^0 = 1
// a^1 = a
// Example: 6^1 = 6
// a^b with b negative means 1 / (a^|b|).
// Example: 2^-3 = 1 / (2^3) = 1/8

public class PowerOfNumber15 {
    public static void finnPowerOfNumber(int base,int exponent){
        if(exponent==0){
            System.out.println(base+"^"+exponent+"="+1);
        }
        else if(exponent>0){
            System.out.println(base+"^"+exponent+"="+(int)(Math.pow(base,exponent)));
        }
        else{
            System.out.println(base+"^"+exponent+"="+(1/Math.pow(base,-exponent)));   
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter base value:");
        int base=s.nextInt();
        System.out.print("enter the exponent value:");
        int exponent=s.nextInt();
        finnPowerOfNumber(base, exponent);

    }
}
