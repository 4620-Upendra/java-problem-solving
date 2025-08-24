// 8.	Count words in a string
// String: "   Hello   world   Java   "
// After trimming → "Hello   world   Java"
// Words: ["Hello", "world", "Java"]
// Count = 3

import java.util.Scanner;

public class CountWordsInString8 {
    public static void countWords(String st){
        String [] arr=st.trim().split(" ");
        System.out.println("Count of words in given string is "+arr.length);
    }
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
        System.out.print("enter the string:");
        String st=s.nextLine();  
        countWords(st);
    }
}
