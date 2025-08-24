// 3.	Check if a number is palindrome
import java.util.Scanner;


public class CheckPalindrome3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=s.nextInt();
        String stNum=String.valueOf(n);
        StringBuffer sb=new StringBuffer(stNum);
        sb.reverse();
        String result="";
        for(int i=0;i<sb.length();i++){
            result+=sb.charAt(i);
        }
        if(result.equals(stNum)){
            System.out.println("the given number is palindrome");
        }
        else{
            System.out.println("the given number is not palindrome");
        }

    }
}
