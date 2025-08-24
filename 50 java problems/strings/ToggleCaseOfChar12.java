
import java.util.Scanner;

// 12.	Toggle case of each character
// 🔹 Example 1
// Input:  "Hello World"
// Process: H→h, e→E, l→L, l→L, o→O, (space), W→w, o→O, r→R, l→L, d→D
// Output: "hELLO wORLD"
public class ToggleCaseOfChar12 {
    public static void toggleCase(String st){
        StringBuffer sb=new StringBuffer(st);
        for(int i=0;i<sb.length();i++){
            if(Character.isUpperCase(sb.charAt(i))){
                 sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            }
            else{
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the string:");
        String string=s.nextLine();
        toggleCase(string);
    }
}
