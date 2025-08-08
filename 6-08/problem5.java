
import java.util.Scanner;

// 5)Write a Java Program that to Convert all uppercase letters into  lowercase and lowercase letters into uppercase in String ?
public class problem5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the enter the string ");
        String st=s.nextLine();
        char [] arr=st.toCharArray();

        for(int i=0;i<st.length();i++){
            char ch=arr[i];
            
            if(Character.isLetter(ch)){

                if(Character.isLowerCase(ch)){
                   
                    ch=Character.toUpperCase(ch);
                    // System.out.println("after:"+ch);
                    arr[i]=ch;
                }
            
                else{
                    ch=Character.toLowerCase(ch);
                    arr[i]=ch;
                }
            }
        }
        // String result=new String(arr);
        // or
        String result=String.valueOf(arr);
        System.out.println("String after converting characters from lower case to uppercase and uppercase to lower case in string: "+result);
    }
    
}
