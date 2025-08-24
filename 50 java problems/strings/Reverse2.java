// 2. Reverse a string
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 

public class Reverse2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the string:");
        String st=s.next();
        char [] ch=st.toCharArray();
        ArrayList<Character>reverseSt=new ArrayList<>();
        for (char c : ch) {
            reverseSt.add(c);
        }
        Collections.reverse(reverseSt);
        String result="";
        for (Character character : reverseSt) {
            result+=character;
        }
        System.out.println("the reverse string of "+st+" is "+result);
    }
}