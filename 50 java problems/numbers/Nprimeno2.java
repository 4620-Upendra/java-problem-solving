// //2.	Generate first N prime numbers
// import java.util.ArrayList;
// import java.util.Scanner;

// public class Nprimeno {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.print("enter the number: ");
//         int n=s.nextInt();
//         ArrayList<Integer>arr=new ArrayList<>();
//         for(int i=2;i<100;i++){
//             boolean isprime=true;
//             for(int j=2;j<i;j++){
//                 if(i%j==0){
//                     isprime=false;
//                 }
//             }
//             if(isprime || i==2){
//                 arr.add(i);
//             }
//             if(arr.size()==n){
//                 break;
//             }
//         }
//         System.out.println("the first "+n+" prime numbers are "+arr.toString());
//         System.out.println(arr.size());
//     }
// }

//2.	Generate first N prime numbers
import java.util.ArrayList;
import java.util.Scanner;

public class Nprimeno2 {
    public static boolean isprime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=s.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        int count=0;
        int num=2;
        while(count<n){
            if(isprime(num)){
                arr.add(num);
                count++;
            }
            num++;
        }
        System.out.println("the first "+n+" prime numbers are "+arr.toString());
        System.out.println(arr.size());
    }
}
