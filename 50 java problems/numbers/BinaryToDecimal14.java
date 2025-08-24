
import java.util.Scanner;

// 14.	Convert binary to decimal

public class BinaryToDecimal14 {
    public static void convertBinaryToDecimal(String n){
        // method 1:by using parseInt method  =Integer.parseInt(binarynumber, 2=radix)
        // System.out.println("the decimal value of binary "+n+" is "+Integer.parseInt(n, 2));

        //method 2:without using direct method
        char [] arr=n.toCharArray();
        int sum=0;
        int power=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!='0'){
                sum+=(int)(Math.pow(2,power ));
            }
            power++;
        }
        System.out.println("the decimal value of binary "+n+" is "+sum);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the binary number:");
        String n=s.next();
        convertBinaryToDecimal(n);
    }
}
