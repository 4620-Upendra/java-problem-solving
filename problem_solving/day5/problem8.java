// Search an element in an array (Linear Search)
// Input:
// arr = [4, 2, 7, 9], key = 7
// Output:
// Found at index 2

public class problem8 {
    public static int linearSearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        if(linearSearch(new int[]{4,2,7,9}, 7)!=-1){
            System.out.println("the target found at index: "+linearSearch(new int[]{4,2,7,9}, 7));
        }
        else{
            System.out.println("the target is not found in given array");
        }
    }
}
