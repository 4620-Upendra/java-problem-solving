// 6.	Remove duplicates from array
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RemoveDuplicates6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int size=s.nextInt();
        ArrayList<Integer> arraylist=new ArrayList<>();

        // ArrayList<Integer> arraylist=new ArrayList<>(
        //     Arrays.asList(20,30,40,20,30)
        // );

        for(int i=0;i<size;i++){
            System.out.print("enter the "+i+" index of element of array:");
            arraylist.add(s.nextInt());
        }
        System.out.println("the array list befor removing depuplicates :"+arraylist);
        Collections.sort(arraylist);
        for(int i=0;i<arraylist.size();i++){
            if(i+1<arraylist.size()){
                if(arraylist.get(i).equals(arraylist.get(i+1))){
                    arraylist.remove(i+1);
                }
            }
        }
        System.out.println("the array list after removing depuplicates :"+arraylist);
    }
}
