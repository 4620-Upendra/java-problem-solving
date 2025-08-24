
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SecondLargestAndSmallest5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int size=s.nextInt();
        ArrayList<Integer> arraylist=new ArrayList<>();
        for(int i=0;i<size;i++){
            System.out.print("enter the "+i+" index of element of array:");
            arraylist.add(s.nextInt());
        }
        System.out.println(arraylist);
        Collections.sort(arraylist);
        System.out.println("the second smallest number is:"+arraylist.get(1));
        System.out.println("the second largest number is:"+arraylist.get(size-2));
    }
}
