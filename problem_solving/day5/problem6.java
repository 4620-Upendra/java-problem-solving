// 6. Count even and odd numbers in an array
// Input:
// [2, 5, 7, 8, 10]
// Output:
// Even = 3, Odd = 2

public class problem6 {
    public static void countOfEvenOdd(int arr[]){
        int countOfEven=0;
        int countOfOdd=0;
        for(int i:arr){
            if(i%2==0){
                countOfEven++;
            }
            else{
                countOfOdd++;
            }
        }
        System.out.println("the count of even elements in array:"+countOfEven);
        System.out.println("the count of odd elements in array:"+countOfOdd);
    }
    public static void main(String[] args) {
        countOfEvenOdd(new int[]{2,5,7,8,10});
    }
}
