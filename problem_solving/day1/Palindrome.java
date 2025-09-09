// What is a Palindrome?
// A palindrome is a word, number, phrase, or sequence of characters that reads the same forward and backward
// Examples in Numbers:
// 121 → reversed, it’s still 121.
// 1331 → same from both sides.
// 12321 → also the same backwards.

import java.util.Scanner;

public class Palindrome{
    public static boolean checkPalindrome(int n){
        StringBuffer sb=new StringBuffer(String.valueOf(n));
        sb.reverse();
        int reverseValue=Integer.parseInt(sb.toString());
        if(reverseValue==n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=s.nextInt();
        System.out.println("given number is palindrome:"+checkPalindrome(n));
    }
}