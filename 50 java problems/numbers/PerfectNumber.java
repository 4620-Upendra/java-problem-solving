// 11.	Check if a number is perfect
import java.util.Scanner;

public class PerfectNumber {
    public static boolean checkPerfectNum(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                // System.out.println(i);
                sum+=i;
            }
        } 
        if(sum==n){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=s.nextInt();
        System.out.println("the given number "+n+" is perfect number:"+checkPerfectNum(n));
        s.close();
    }
}
