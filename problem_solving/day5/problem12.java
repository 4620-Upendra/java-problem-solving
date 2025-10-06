
// Input:
// [1, 2, 3, 2, 4, 5, 1]
// Output:
// Duplicates: 1, 2

import java.util.Arrays;

public class problem12 {
    public static boolean presentElement(int ele,int []arr){
        for(int i:arr){
            if(i==ele){
                return true;
            }
        }
        return false;
    }
    public static void findDuplicates(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(i!=0){
                if(!(presentElement(arr[i], Arrays.copyOfRange(arr,0,i)))){
                    int count=0;
                    for(int j=0;j<arr.length;j++){
                        if(arr[i]==arr[j]){
                            count++;
                        }
                    }
                    if(count>1){
                        System.out.print(arr[i]+" ");
                    }
                }
            }
            else{
                int count=0;
                for(int j=0;j<arr.length;j++){
                        if(arr[i]==arr[j]){
                            count++;
                        }
                }
                if(count>1){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
    public static void main(String args[]){
        // findDuplicates(new int[]{1,2,3,3,2,4,5,1});
        findDuplicates(new int[]{1,2,3,2,4,5,1});
    }
}
