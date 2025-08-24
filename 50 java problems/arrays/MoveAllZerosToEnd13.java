
import java.util.Arrays;
import java.util.Scanner;

// 12.	Find unique element in array
public class MoveAllZerosToEnd13 {
    public static void moveZeros(int [] arr){
        System.out.println("array before moving zeros to end of array:"+Arrays.toString(arr));
        int position=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[position]=arr[i];
                position++;
            }
        }
        if(position!=arr.length-1){
            for(int i=position;i<arr.length;i++){
                arr[i]=0;
            }
        }
        System.out.println("array after moving zeros to end of array:"+Arrays.toString(arr));
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
        moveZeros(arr);
    }
}
