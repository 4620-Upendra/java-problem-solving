// 9.	Find longest word in sentence

import java.util.Scanner;
public class LorestWord9 {
    public static void LongestWord(String string){
        String [] arr=string.trim().split(" ");
        String LargestWord="";
        for(String st:arr){
            if(LargestWord.length()<st.length()){
                LargestWord=st;
            }
        }
        System.out.println("the longest word in sentence is:"+LargestWord);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the sentence:");
        String string=s.nextLine();
        LongestWord(string);

    }
}
