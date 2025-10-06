// 18. Find pairs with given sum
// Input:
// arr = [1, 5, 7, -1, 5], sum=6
// Output:
// Pairs: (1,5), (7,-1)

import java.util.Arrays;

public class problem18 {
    public static boolean checkElePresent(int ele,int arr[]){
        for(int i:arr){
            if(ele==i){
                return true;
            }
        }
        return false;
    }
    public static int [] findUnique(int arr[]){
        int noOfUniqueEle=0;
        for(int i=0;i<arr.length;i++){
            if(!(checkElePresent(arr[i], Arrays.copyOfRange(arr, 0, i)))){
                noOfUniqueEle++;
            }
        }
        int unique[]=new int[noOfUniqueEle];
        int noUniqueEle=0;
        for(int i=0;i<arr.length;i++){
            if(!(checkElePresent(arr[i], Arrays.copyOfRange(arr, 0, i)))){
                unique[noUniqueEle++]=arr[i];
            }
        }
        return unique;
    }
    public static void findPairs(int arr[],int target){
        int [] unique=findUnique(arr);
        System.out.println(Arrays.toString(unique));
        System.out.print("pairs:");
        for(int i=0;i<unique.length;i++){
            if(i+1<unique.length){
                for(int j=i+1;j<unique.length;j++){
                    if(unique[i]+unique[j]==target){
                        System.out.print("("+unique[i]+","+unique[j]+"), ");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        findPairs(new int[]{1,5,7,-1,5}, 6);
    }
}
