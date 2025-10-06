// 11. Sort an array (Descending)
// Input:
// [5, 1, 4, 2, 8]
// Output:
// [8, 5, 4, 2, 1]

import java.util.Arrays;

public class problem11 {
     public static void sortArraydescendingOrder(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("sorted array in descending order:"+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        sortArraydescendingOrder(new int[]{5,1,4,2,8});
    }
}
