// 19. Find the majority element (appears more than n/2 times)
// Input:
// [3, 3, 4, 2, 3, 3, 5, 3]
// Output:
// Majority = 3

import java.util.Arrays;

public class problem19 {
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
    public static int appearsOfEleMajority(int arr[]){
        int countOfAppearsEle=0;
        int unique[]=findUnique(arr);
        for(int i:unique){
            int count=0;
            for(int j:arr){
                if(i==j){
                    count++;
                }
            }
            if(count>arr.length/2 &&count>countOfAppearsEle){
                countOfAppearsEle=i;
            }
        }
        return countOfAppearsEle;
    }
    public static void main(String[] args) {
        // System.err.println("the majority element (appears more than n/2 times) in given array :"+appearsOfEleMajority(new int[]{30,30,30,30,30,3,5,3}));
        System.err.println("the majority element (appears more than n/2 times) in given array :"+appearsOfEleMajority(new int[]{3,3,4,2,3,3,5,3}));
    }
}
