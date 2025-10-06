// 13. Remove duplicates from an array
// Input:
// [1, 2, 2, 3, 4, 4, 5]
// Output:
// [1, 2, 3, 4, 5]

import java.util.Arrays;

public class problem13{
    public static boolean checkElepresent(int arr[] ,int target){
        for(int i:arr){
            if(i==target){
                return true;
            }
        }
        return false;
    }
    public static int [] removeDuplicates(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(!(checkElepresent(Arrays.copyOfRange(arr, 0, i), arr[i]))){
                count++;
            }
        }
        int [] result=new int[count];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(!(checkElepresent(Arrays.copyOfRange(arr, 0, i), arr[i]))){
                result[j++]=arr[i];
            }
        }
        return result;
    }
    public static void main(String [] args){
        int arr[]=new int[]{1,2,2,3,4,4,5};
        System.out.println("array before removing duplicates:"+Arrays.toString(arr));
        System.out.println("array after removing duplicates:"+Arrays.toString(removeDuplicates(arr)));
    }
}