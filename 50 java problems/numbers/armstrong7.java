// 7.	Check if a number is Armstrong

import java.util.ArrayList;
import java.util.Scanner;

public class armstrong7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=s.nextInt();
        String nValue=String.valueOf(n);
        char [] ch= nValue.toCharArray();
        ArrayList<Character> arraylist=new ArrayList<>();
        for(char ch1:ch){
            arraylist.add(ch1);
        }
        int sum=0;
        for(char value:arraylist){
            int subSum=1;
            for(int i=0;i<nValue.length();i++){
                subSum*=Character.getNumericValue(value);
            }
            sum+=subSum;
        }
        boolean result=sum==n?true:false;
        System.out.println("the given number is Amstrong:"+result);
    }
}
