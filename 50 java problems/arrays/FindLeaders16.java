
import java.util.Scanner;

// 16.	Find leaders in array
// 🔹 Example 1
// Array: [16, 17, 4, 3, 5, 2]
// Start from the rightmost element:
// 2 → no elements to the right → leader ✅
// 5 → greater than 2 → leader ✅
// 3 → smaller than 5 → not a leader ❌
// 4 → smaller than 5 → not a leader ❌
// 17 → greater than all elements to its right (4,3,5,2) → leader ✅
// 16 → smaller than 17 → not a leader ❌
// 👉 Leaders = [17, 5, 2]

// 🔹 Example 2
// Array: [7, 10, 4, 10, 6, 5, 2]
// 2 → leader ✅
// 5 → greater than 2 → leader ✅
// 6 → greater than 5, 2 → leader ✅
// 10 → greater than 6, 5, 2 → leader ✅
// 4 → smaller than 10 → not a leader ❌
// 10 → greater than 4,10,6,5,2? No (equal to 10, but allowed) → leader ✅
// 7 → smaller than 10 → not a leader ❌
// 👉 Leaders = [10, 10, 6, 5, 2]

public class FindLeaders16 {
    public static void leaders(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            boolean isLeaderElement=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    isLeaderElement=false;
                }
            }
            if(isLeaderElement){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print(arr[arr.length-1]);
    }
    public static int [] fillArray(int size,Scanner s){
        int arr []=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("enter the "+i+" index element:");
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        // int [] arr={16, 17, 4, 3, 5, 2};
        Scanner s=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int size=s.nextInt();
        int [] arr=fillArray(size, s);
        System.out.print("the leaders from the given array are:");
        leaders(arr);
        
    }
}
