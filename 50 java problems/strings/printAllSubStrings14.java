// 14.	Print all substrings

import java.util.Scanner;

// For "abcd", let’s list all substrings step-by-step:   input:abcd
// Start at index 0: "a", "ab", "abc", "abcd"
// Start at index 1: "b", "bc", "bcd"
// Start at index 2: "c", "cd"
// Start at index 3: "d"

// Output:
// a  
// ab  
// abc  
// abcd  
// b  
// bc  
// bcd  
// c  
// cd  
// d
public class printAllSubStrings14 {
    public static void printinfSubStrings(String st){
        for(int i=0;i<st.length();i++){
            for(int j=i;j<st.length();j++){
                for(int k=i;k<=j;k++){
                    System.out.print(st.charAt(k));
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the string:");
        String st=s.next();
        System.out.println("all possible substrings of the given string:");
        printinfSubStrings(st);
    }
}
