// 9.	Find GCD of two numbers
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GCD8 {
    public static ArrayList<Integer> factors(int n){
        ArrayList<Integer> factors=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                factors.add(i);
            }
        }
        return factors;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the first number:");
        int n1=s.nextInt();
        System.out.print("enter the second number:");
        int n2=s.nextInt();
        ArrayList<Integer>arr1=factors(n1);
        ArrayList<Integer>arr2=factors(n2);
        ArrayList<Integer>arr3=new ArrayList<>();
        for(int value1:arr1){
            for(int value2:arr2){
                if(value1==value2){
                    arr3.add(value1);
                }
            }
        }
        Collections.sort(arr3);
        System.out.println("GCD(Greatest Common Divisor) of given numebr is:"+arr3.get(arr3.size()-1));
    }
}
