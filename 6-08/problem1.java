// 1)Write a Java Program that to accept String input from user(Email-id) and check whether Characters in the Email-id are alphabets,
// if its alphabets try to count no of vowels and no of consonants and check whether Characters in the Email-id are numbers,if its Numbers
// try to add all even numbers and count no of odd numbers and if its special Characters try to count no of Special Characters ?
import java.util.ArrayList;
import java.util.Scanner;

public class problem1{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the email:");
        String email=s.next();
        char [] ch=email.toCharArray();
        ArrayList<Character> chararray=new ArrayList<>();
        for(char c:ch){
            chararray.add(c);
        }

        int countOfVowels=0;
        int countOfConsonants=0;
        int sumOfEvenNumbers=0;
        int countOfOddNumbers=0;
        int countOfSymbals=0;
        for(char letter:chararray){
            if(Character.isLetter(letter)){
                letter=Character.toLowerCase(letter);
                if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
                    countOfVowels++;
                }
                else{
                    countOfConsonants++;
                }
            }
            else if(Character.isDigit(letter)){
                int num=Character.getNumericValue(letter);
                if(num%2==0){
                    sumOfEvenNumbers+=num;
                }
                else{
                    countOfOddNumbers++;
                }
            }
            else{
                countOfSymbals++;
            }
        }
        System.out.println("count of vowels in given email:"+countOfVowels); 
        System.out.println("count of consonants in given email:"+countOfConsonants); 
        System.out.println("sum of even numbers in given email:"+sumOfEvenNumbers); 
        System.out.println("count of add numbers in given email:"+countOfOddNumbers); 
        System.out.println("count of symbals in given email:"+countOfSymbals); 
    }
}