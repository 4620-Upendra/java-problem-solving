import java.util.ArrayList;
import java.util.Arrays;
public class problem4 {
    public static int [] sumOfEvenAndOdd(int [] arr){
        int [] arrayOFEO=new int[2];
        int sumOfEven=0;
        int sumOfOdd=0;
        for(int i:arr){
            if(i%2==0){
                sumOfEven+=i;
            }
            else{
                sumOfOdd+=i;
            }
        }
        arrayOFEO[0]=sumOfEven;
        arrayOFEO[1]=sumOfOdd;
        return arrayOFEO;
    }
    public static int findMax(int arr []){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static ArrayList<Integer> minFactors(int [] arr ){
        Arrays.sort(arr);
        int min=arr[0];
        ArrayList<Integer> minFactoriesList=new ArrayList<>();
        for(int i=1;i<=min;i++){
            if(min%i==0){
                minFactoriesList.add(i);
            }
        }
        return minFactoriesList;
    }
    public static boolean  checkPrime(int n){
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5,6,7};
        int arr[] = {2, 2, 1, 3};
        // int arr[] = {1, 3, 5, 7};
        int [] evenAndOdd=sumOfEvenAndOdd(arr);
        int sumOfEvenEle=evenAndOdd[0];
        int sumOfOddEle=evenAndOdd[1];
        System.out.println("sum of even:"+sumOfEvenEle);
        System.out.println("sum of odd:"+sumOfOddEle);
        if(sumOfEvenEle>sumOfOddEle){
            System.out.println("the max element inn given array:"+findMax(arr));
        }
        else if(sumOfEvenEle<sumOfOddEle){
            Integer minEleFactors []=minFactors(arr).toArray(new Integer[0]);
            System.out.print("the factores of min element in given array:");
            for(Integer i:minEleFactors){
                System.out.print(i+" ");
            }
        }
        else{
            System.out.println("the sum of even or odd is prime:"+checkPrime(sumOfOddEle));
        }
    }
}

// 1)int arr[] = {2, 4, 6, 8};
// Even sum = 2+4+6+8 = 20
// Odd sum = 0
// Even > Odd → print max element
// output:
// sum of even: 20
// sum of odd: 0
// true
// the max element in given array: 8

// 2)int arr[] = {1, 3, 5, 7};
// Even sum = 0
// Odd sum = 1+3+5+7 = 16
// Odd > Even → print factors of min element (1)
// output:
// sum of even: 0
// sum of odd: 16
// false
// the factors of min element in given array: 1 

// 3)int arr[] = {2, 2, 1, 3};
// Even sum = 2+2 = 4
// Odd sum = 1+3 = 4 ✅ Equal!
// Then it checks if sum (4) is prime → false
