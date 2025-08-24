// 4.	Reverse digits of a number

import java.util.Scanner;

public class reverseDigits4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=s.nextInt();
        String stNum=String.valueOf(n);
        StringBuffer sb=new StringBuffer(stNum);
        sb.reverse();
        System.out.println("reverse digits of a number"+sb.toString());
    }
}
