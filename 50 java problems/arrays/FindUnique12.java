// 12.	Find unique element in array
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindUnique12{
    public static void findUnique(int [] arr){
        boolean unique=true;
        ArrayList<Integer>loopCompleted=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    unique=false;
                }
            }
            if(unique){
                if(!loopCompleted.contains(arr[i])){
                    System.out.print(arr[i]+" ");
                }
            }
            loopCompleted.add(arr[i]);
            unique=true;
            
        }
        if(!unique){
            System.out.println("in the given array "+ Arrays.toString(arr)+" there are no unique elements");
        }
    }
    public static int [] fillingArray(int size,Scanner s){
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("enter "+i+" index element :");
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int size=s.nextInt();
        int [] arr=fillingArray(size, s);
        findUnique(arr);
    }
}