// 4.	Remove duplicate characters
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicateChars4 {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        System.out.print("enter the string:");
        String string=s.nextLine();
        ArrayList<Character> arr=new ArrayList<>();
        char [] arr1=string.toCharArray();
        for(char ch:arr1){
            arr.add(ch);
        }
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i).equals(arr.get(j))){
                    arr.remove(j);
                }
            }
        }
        String result="";
        for(char ch:arr){
            result+=ch;
        }
        System.out.println("string after removing duplicate:"+result);
    }
}
