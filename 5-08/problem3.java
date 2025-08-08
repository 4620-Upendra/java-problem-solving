//write a program to remove character from user input string
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("enter the string :");
        String st=s.nextLine();
        System.out.print("enter the character to remove from string:");
        String ch=s.next();
        char ch1=ch.charAt(0);
        char [] arr=st.toCharArray();
        String result="";
        for(char ch2:arr){
            if(ch1!=ch2){
                result+=ch2;
            }
        }
        System.out.println(result);

    }
}
