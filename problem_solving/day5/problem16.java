// 16. Find the frequency of each element
// Input:
// [10, 20, 10, 30, 20, 10]
// Output:
// 10 → 3 times
// 20 → 2 times
// 30 → 1 time

import java.util.Arrays;

public class problem16 {
    public static boolean checkElementPresent(int arr[],int target){
        for(int i:arr){
            if(i==target){
                return true;
            }
        }
        return false;
    }

    public static void frequencyOfEle(int arr[]){
        for(int i=0;i<arr.length;i++){
            int count=0;
            if(i!=0){
                if(!(checkElementPresent(Arrays.copyOf(arr, i), arr[i]))){
                    for(int j=0;j<arr.length;j++){
                        if(arr[i]==arr[j]){
                            count++;
                        }
                    }
                    System.out.println(arr[i]+" - "+count);
                }
            }
            else{
                for(int j=0;j<arr.length;j++){
                        if(arr[i]==arr[j]){
                            count++;
                        }
                }
                System.out.println(arr[i]+" - "+count);
            }
            

        }
    }
    public static void main(String[] args) {
        frequencyOfEle(new int[]{10,20,10,30,20,10});
    }
}
