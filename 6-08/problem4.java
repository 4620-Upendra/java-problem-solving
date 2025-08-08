// 4)Write a Java Program that to Print Fibonacci Series up to N Terms ?

import java.util.ArrayList;
import java.util.Scanner;

public class problem4 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number:");
        int n =s.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(0);
        arr.add(1);
        for(int i=2;i<n;i++){
            arr.add(arr.get(i-1)+arr.get(i-2)); 
        }
        System.out.println("Fibonacci Series up to "+n+" terms:"+arr);
    }
}
