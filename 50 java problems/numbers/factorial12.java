// 12.	Find factorial using loop and recursion

import java.util.Scanner;

public class factorial12 {
     public static int factorialsOfN(int n){
        int factorialresult=1;
        if(n==0){
            return factorialresult;
        }
        else{
            for(int i=1;i<=n;i++){
                factorialresult*=i;
            } 
            return factorialresult;
        }
    }
    public static int factorialUsingRecursion(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*factorialUsingRecursion(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=s.nextInt();
        System.out.println("factorial of "+n+" by using for loop is "+factorialsOfN(n));
        System.out.println("factorial of "+n+" by using recursion is "+factorialsOfN(n));
    }
}
