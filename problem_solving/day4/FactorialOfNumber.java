
import java.util.Scanner;

public class FactorialOfNumber {
    public static int findFactorial(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=s.nextInt();
        System.out.println("factorial of given number:"+findFactorial(n));
    }
}
