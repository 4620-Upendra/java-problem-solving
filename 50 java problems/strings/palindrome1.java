//1. Check if a string is palindrome 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class palindrome1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the string:");
        String st=s.next();
        char [] ch=st.toCharArray();
        ArrayList<Character>reverse=new ArrayList<>();
        for (char c : ch) {
            reverse.add(c);
        }
        Collections.reverse(reverse);
        String result="";
        for (Character character : reverse) {
            result+=character;
        }
        if(st.equals(result)){
            System.out.println(st+" is palindrome ");
        }
        else{
            System.out.println(st+" is not palindrome ");
        }
    }
}
