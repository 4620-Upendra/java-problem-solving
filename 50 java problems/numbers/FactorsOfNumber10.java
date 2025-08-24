
import java.util.ArrayList;
import java.util.Scanner;

// 10.	Print all factors of a number
public class FactorsOfNumber10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=s.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=1;i<n+1;i++){
            if(n%i==0){
                arr.add(i);
            }
        }
        System.out.println(arr);
        s.close();
    }
}
