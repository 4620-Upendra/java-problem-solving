// 20. Find maximum subarray sum (Kadane’s Algorithm)
// Input:
// [-2, -3, 4, -1, -2, 1, 5, -3]
// Output:
// Max Sum = 7
// Explanation: Subarray [4, -1, -2, 1, 5]

public class problem20 {
    public static int findMaximumSubArray(int arr[]){
        int maxSum=arr[0];
        int currSum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>0 && currSum<0){
                currSum=arr[i];
            }
            else{
                currSum+=arr[i];
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        System.out.println("maximum subarray sum (Kadane’s Algorithm) of given array is:"+findMaximumSubArray(new int[]{-2,-3,4,-1,-2,1,5,-3}));
    }
}
