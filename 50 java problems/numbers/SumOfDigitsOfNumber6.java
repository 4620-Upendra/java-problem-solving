// 6.	Sum of digits
import java.util.Scanner;

public class SumOfDigitsOfNumber6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=s.nextInt();
         String st=String.valueOf(n);
         int sum=0;
         for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            sum+=Character.getNumericValue(ch);
         }
         System.out.println("the sum of digits in number is "+sum);
    }
}
