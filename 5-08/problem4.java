// 4)Write a Java Program that to count number of words in a String?
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the string:");
        String st=s.nextLine();
        st.trim();
        int count=0;
        char [] arr=st.toCharArray();
        for(char ch:arr){
            if(ch==' '){
                count++;
            }
        }
        if(arr.length>0){
            System.out.println("the count of words in the given string is "+(count+1));
        }
        else{
           System.out.println("the count of words in the given string is "+count);
        }
    }
}
