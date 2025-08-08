
import java.util.Scanner;

// 2)Write a Java Program that to Convert an Character to double and Vieversa ?
public class problem2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the character:");
        String st=s.next();
        char ch=st.charAt(0);
        double charValue=ch;   //inplicity conversion
        System.out.println("double value of char:"+charValue);
        char ch1=(char)charValue;    //explicity conversion
        System.out.println("char value of double:"+ch1);
    }
}
