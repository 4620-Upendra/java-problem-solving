// 1.	Check if a number is prime
import java.util.Scanner;
public class prime1{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number:");
        int n=s.nextInt();
        boolean isPrime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        System.out.println(n+" "+(isPrime?"is prime number":"is not a prime number"));
    }
}