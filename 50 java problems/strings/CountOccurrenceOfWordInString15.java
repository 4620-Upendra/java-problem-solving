
import java.util.Scanner;


// 15.	Count occurrence of a word in a string
// 🔹 Problem Explanation
// We are given a sentence (string) and a word.
// We need to count how many times that word appears in the string.
// 👉 Example
// Input: 
// String = "the sky is blue and the sun is bright"
// Word = "the"
// Output: 
// Occurrence of 'the' = 2

public class CountOccurrenceOfWordInString15 {
    public static void CountOccurrenceOfWord(String string,String word){
        String [] arr=string.trim().split(" ");
        int count=0;
        for(String st:arr){
            if(st.equalsIgnoreCase(word)){
                count++;
            }
        }
        System.out.println("The occurrence of '" + word + "' in the given string is: " + count);

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the string:");
        String st=s.nextLine();
        System.out.print("enter the word to secarch:");
        String word=s.next();
        CountOccurrenceOfWord(st, word);
    }
}
