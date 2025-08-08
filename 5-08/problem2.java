//write  a program of factorial of a number using recursion function and without recursion
import java.util.Scanner;


public class problem2 {
    public static int factorial(int n){
        int fat=1;
        if(n==0){
            return fat;
        }
        else{
            for(int i=1;i<=n;i++){
                fat*=i;
            }
            return fat;
        }
    }
    public  static int factorialWithRecursion(int n){
        int fat=1;
        if(n==0){
            return 1;
        }
        else{
            return n*factorialWithRecursion(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number :");
        int n=s.nextInt();
        System.out.println("the factorial of "+n+" without recursion is "+factorial(n));
        System.out.println("the factorial of "+ n +" with recursion is "+factorialWithRecursion(n));
    }
}
