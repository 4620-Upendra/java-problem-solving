// Check whether given number is strong number or not

public class StrongNo {
    public static int findFactorial(int n){
        int factorial=1;
        if(n!=0){
            for(int i=1;i<=n;i++){
                factorial*=i;
            }
        }
        return factorial;
    }
    public static boolean checkStrongNo(int n){
        int sumOfDigitsFactorials=0;
        int temp=n;
        while(temp!=0){
            sumOfDigitsFactorials+=findFactorial(temp%10);
            temp/=10;
        }
        return n==sumOfDigitsFactorials;

    }
    public static void main(String[] args) {
        int n=145;
        System.out.println("the given number is strong number:"+checkStrongNo(n));
    }
}

// 👉 Suppose the given number is 145.
// Digits are: 1, 4, 5
// Factorials:
// 1! = 1
// 4! = 24
// 5! = 120
// Sum = 1 + 24 + 120 = 145
// Compare: 145 = 145 ✅
// So, 145 is a Strong Number.
// 👉 Another example: given number 123
// Digits are: 1, 2, 3
// Factorials:
// 1! = 1
// 2! = 2
// 3! = 6
// Sum = 1 + 2 + 6 = 9
// Compare: 123 ≠ 9 ❌
// So, 123 is not a Strong Number.

// Let’s check for the number 5 👇
// Digits → just 5
// Factorial → 5! = 5 × 4 × 3 × 2 × 1 = 120
// Sum of factorials = 120
// Compare with original number: 120 ≠ 5 ❌
// ➡️ So, 5 is NOT a Strong Number.