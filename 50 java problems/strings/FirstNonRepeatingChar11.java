
import java.util.Scanner;

// 11.	Find first non-repeating character
// 🔹 Example 1
// Input: "swiss"
// Step 1: Count frequencies
//    s → 3
//    w → 1
//    i → 1
// Step 2: Check from left
//    's' → repeats
//    'w' → appears once ✅ (Answer)
// Output: w
public class FirstNonRepeatingChar11 {
    public static void firstNonReaptedchar(String string){
        char [] arr=string.toCharArray();
        for(char ch:arr){  
            int countOfChar=0; 
            for( char ch1:arr){
                if(ch==ch1){
                    countOfChar++;
                }
            }
            if(countOfChar==1){
                System.out.println("first non-repeating character in given string is:"+ch);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the string:");
        String string=s.nextLine();
        firstNonReaptedchar(string);
    }
}
