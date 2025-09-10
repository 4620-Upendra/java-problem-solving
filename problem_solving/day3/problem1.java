// Prime Number {11,12,13,14,15,16,17,18,19}
// Print primes and non primes

import java.util.Arrays;
public class problem1{
    public static void printPrimesAndNonPrimes(int arr[]){
        int NoPrimes=0;
        for(int i:arr){
            int count=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                NoPrimes++;
            }
        }
        int noNonPrimes=arr.length-NoPrimes;
        int [] primeArray=new int[NoPrimes];
        int [] noNonPrimeArray=new int[noNonPrimes];
        int indexOfPrime=0;
        int indexOfNonPrime=0;
        for(int i:arr){
            int count=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                primeArray[indexOfPrime++]=i;
            }
            else{
                noNonPrimeArray[indexOfNonPrime++]=i;
            }
        }
        System.out.println("prime numbers array:"+Arrays.toString(primeArray));
        System.out.println("non prime numbers array:"+Arrays.toString(noNonPrimeArray));

    }
    public static void main(String[] args) {
        int [] arr={11,12,13,14,15,16,17,18,19};
        printPrimesAndNonPrimes(arr);
    }
}