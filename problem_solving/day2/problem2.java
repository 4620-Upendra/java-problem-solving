// 2)sum of even elements in array
public class problem2 {
    public static int sumOfEvenEle(int arr []){
        int sumOfEven=0;
        for(int i:arr){
            if(i%2==0){
                sumOfEven+=i;
            }
        }
        return sumOfEven;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println("the sum even elements in given array:"+sumOfEvenEle(arr));
    }
}
