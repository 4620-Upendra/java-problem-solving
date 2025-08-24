// 13.	Compress the string (count repeating chars)   input:aabbab
// Let’s break down "aabbab" step-by-step for string compression (count consecutive characters):
// 'a' → appears 2 times → "a2"
// 'b' → appears 2 times → "b2"
// 'a' → appears 1 time → "a1"
// 'b' → appears 1 time → "b1"
// Output:a2b2a1b1
// Example:
// Input:  aaabbccccd
// 'a' → appears 3 times → "a3"
// 'b' → appears 2 times → "b2"
// 'c' → appears 4 times → "c4"
// 'd' → appears 1 time → "d1"
// Output:a3b2c4d1

import java.util.Scanner;

public class CompressString {
    public static void doingCompressOfString(String st){
        String result="";
        char ch[]=st.toCharArray();
        int repeat=1;
        for(int i=0;i<ch.length;i++){
            if(i+1<ch.length || i==ch.length-1 ){
                 if(i+1<ch.length){
                    if(ch[i]==ch[i+1]){
                        repeat++;
                    }
                    else{
                        result=result+ch[i]+repeat;
                        repeat=1;
                    }
                 }
                 else{
                    result=result+ch[i]+repeat;
                    repeat=1;
                }
            }
        }
        System.out.println("the Compress of  string (count repeating chars) "+st+" is "+result);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the string:");
        String st=s.next();
        doingCompressOfString(st);

    }
}
