// 10.	Check if two strings are rotations
// 🔹 What is a rotation?
// A string is said to be a rotation of another string if you can take some characters from the beginning of one string and move them to the end (or vice versa), and the result matches the other string.
// 🔹 Example 1
// String A = "ABCD"  
// String B = "CDAB"
// 👉 If we rotate "ABCD" by moving "AB" to the end, we get "CDAB".
// So B is a rotation of A ✅

// 🔹 Trick to Check (Concept)
// If B is a rotation of A, then B will always be a substring of A+A.
// 👉 Example:
// A = "ABCD"
// A+A = "ABCDABCD"
// Now check if B = "CDAB" is inside "ABCDABCD" → ✅ Yes → Rotation.
import java.util.Scanner;

public class TwostringsAreRotations10 {
    public static void checkTwoStringsAreRotations(String string1,String string2){
        string1=string1+string1;
        boolean result=string1.contains(string2);
        System.out.println("given two strings are rotations:"+result);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the string1:");
        String string1=s.nextLine();
        System.out.print("enter the string2:");
        String string2=s.nextLine();
        checkTwoStringsAreRotations(string1, string2);
    }
}
