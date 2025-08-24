// 7.	Merge two sorted arrays
// import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
public class MergeTwoArrays7 {
    public static int [] arrayfilling(int n,String st){
        Scanner s=new Scanner(System.in);
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the "+i+" index element of "+st+" :");
            arr[i]=s.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the size of first array:");
        int size1=s.nextInt();
        System.out.print("enter the size of second array:");
        int size2=s.nextInt();

        int arr1[] = arrayfilling(size1,"array1");
        int arr2[] = arrayfilling(size2,"array2");
        int arr3[]=new int[arr1.length+arr2.length];
        int x=0;
        int y=0;
        for(int i=0;i<arr3.length;i++){
            if(x<4){
                arr3[i]=arr1[x++];
            }
            else{
                arr3[i]=arr2[y++];
            }
            
        }
        for(int i=0;i<arr3.length;i++){
            for(int j=i+1;j<arr3.length;j++){
                if(arr3[i]>arr3[j]){
                    int temp=arr3[i];
                    arr3[i]=arr3[j];
                    arr3[j]=temp;
                }
            }
        }
        System.out.println("Merged array of two sorted arrays is "+Arrays.toString(arr3));
        s.close();    
    }
}
