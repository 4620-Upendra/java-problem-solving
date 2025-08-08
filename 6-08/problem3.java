// 3)Write a Java Program that to Create a Single-Dimensional String array and try to sort that array in Descending Order alphabetically ?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the string:");
        String string=s.nextLine();
        ArrayList<String> arr1=new ArrayList<>();
        String [] arr=string.split(" ");
        // System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        for(String st:arr){
            arr1.add(st);
        }
        Collections.reverse(arr1);
        System.out.println(arr1);
    }
}
