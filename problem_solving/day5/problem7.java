// 7. Find the maximum and minimum element in an array
// Input:
// [3, 7, 1, 9, 5]
// Output:
// Max = 9, Min = 1

public class problem7 {
    public static void minAndMax(int arr[]){
        int min=arr[0];
        int max=arr[0];
        for(int i:arr){
            if(min>i){
                min=i;
            }
            if(max<i){
                max=i;
            }
        }
        System.out.println("maximum element in given array:"+max);
        System.out.println("minimum element in given array:"+min);
    }
    public static void main(String[] args) {
        minAndMax(new int[]{3,7,1,9,5});
    }
}
