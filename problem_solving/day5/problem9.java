// 9. Binary Search in a sorted array
// Input:
// arr = [1, 3, 5, 7, 9], key = 5
// Output:
// Found at index 2

public class problem9 {
    public static int binarySearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        if(binarySearch(new int[]{1,3,5,7,9}, 5)!=-1){
            System.out.println("the target found at index: "+binarySearch(new int[]{1,3,5,7,9}, 5));
        }
        else{
            System.out.println("the target is not found in given array");
        }
    }
}
