// 5.	Count digits in a number
import java.util.Scanner;

public class CountDigitsOfNumber5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=s.nextInt();
        String st=String.valueOf(n);
        System.out.println("the count of digits in a number:"+st.length());
    }
}
