// 7.	Convert string to title case

import java.util.Scanner;
public class TitleCase7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the string:");
        String string=s.nextLine();
        String [] arr=string.trim().split(" ");
       
        for(int i=0;i<arr.length;i++){
            char[] ch=arr[i].toCharArray();
            for(int j=0;j<ch.length;j++){
                if(j==0){
                    ch[j]=Character.toUpperCase(ch[j]);
                }
                else{
                    ch[j]=Character.toLowerCase(ch[j]);
                }
            }
            arr[i]=String.valueOf(ch);
        }
       
        String result=String.join(" ", arr);
        System.out.println("the given string in title case:"+result);
    }
}
