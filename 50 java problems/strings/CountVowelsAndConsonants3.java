// 3.	Count vowels and consonants
import java.util.Scanner;

public class CountVowelsAndConsonants3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the string:");
        String string=s.nextLine();
        int countOfvowels=0;
        int countOfConsonants=0;
        StringBuffer sb=new StringBuffer(string);
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            ch=Character.toLowerCase(ch);
            if(Character.isLetter(ch)){
                if(ch=='a'|| ch=='u'||ch=='i'||ch=='o'||ch=='e'){
                    countOfvowels++;
                }
                else{
                    countOfConsonants++;
                }
            }
        }
        System.out.println("the count of vowels in the given string:"+countOfvowels);
        System.out.println("the count of consonants in the given string:"+countOfConsonants);
    }
}
