// 13.	Convert decimal to binary
// Example – Convert 13 to binary:
// 13 ÷ 2 = 6 remainder 1
// 6 ÷ 2 = 3 remainder 0
// 3 ÷ 2 = 1 remainder 1
// 1 ÷ 2 = 0 remainder 1

// Now read remainders from bottom to top: 1101=13.

 
import java.util.Scanner;



public class DecimalToBinary13 {
    public static void convertDecimalToBinary(int n){
        //method 1:without usingbultin method
        // String binary="";
        // while(n!=0){
        //     binary+=n%2;
        //     n=n/2;
        // }
        // StringBuffer sb=new StringBuffer(binary);
        // sb.reverse();
        // binary=sb.toString();
        // int result=Integer.parseInt(binary);
        // System.out.println("binary code of "+n+" is "+result);

        //method 1:by using using bultin method

        String binary=Integer.toBinaryString(n);
        System.out.println("binary code of "+n+" is "+binary);


    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=s.nextInt();
        convertDecimalToBinary(n);
        s.close();
    }
}
