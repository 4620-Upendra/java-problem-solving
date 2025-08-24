
import java.util.Arrays;
import java.util.Scanner;

public class Anagram6 {
    public static boolean checkIsAnangram(String str1,String str2){
        if(str1.length()==str2.length()){
            char [] arr1=str1.toCharArray();
            char [] arr2=str2.toCharArray();
            Arrays.sort(arr2);
            Arrays.sort(arr1);
            System.out.println(Arrays.toString(arr1));
            System.out.println(Arrays.toString(arr2));
            for(int i=0;i<str1.length();i++){
                if(arr1[i]!=arr2[i] ){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the string1:");
        String string1=s.nextLine();
        System.out.print("enter the string2:");
        String string2=s.nextLine();
        System.out.println("the given string are anagram:"+checkIsAnangram(string1, string2));  
    }
}
