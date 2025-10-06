// 10. Sort an array (Ascending)
// Input:
// [5, 1, 4, 2, 8]
// Output:
// [1, 2, 4, 5, 8]

import java.util.Arrays;

public class problem10 {
    public static void sortArrayAscendingOrder(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("sorted array in ascending order:"+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        sortArrayAscendingOrder(new int[]{5,1,4,2,8});
    }
}
