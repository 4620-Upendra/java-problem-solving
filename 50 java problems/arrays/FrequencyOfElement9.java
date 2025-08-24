
import java.util.ArrayList;
import java.util.Scanner;

// 9.	Count frequency of each element
public class FrequencyOfElement9 {
    public static ArrayList<Integer> fillarray(int n){
        ArrayList<Integer>arr=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("enter the "+i+" index element :" );
            arr.add(s.nextInt());
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int size=s.nextInt();
        ArrayList<Integer> arr=fillarray(size);
        // ArrayList<Integer> copyOfArr=new ArrayList<>(arr);
        // Or
        ArrayList<Integer> copyOfArr=new ArrayList<>();
        copyOfArr.addAll(arr);
        for(int i=0;i<copyOfArr.size();i++){
            for(int j=i+1;j<copyOfArr.size();j++){
                if(copyOfArr.get(i).equals(copyOfArr.get(j))){
                    copyOfArr.remove(j);
                }
            }
        }
        ArrayList<Integer>frequency=new ArrayList<>();
        for(int i=0;i<copyOfArr.size();i++){
            int count=0;
            for(int j=0;j<arr.size();j++){
                if(copyOfArr.get(i).equals(arr.get(j))){
                    count++;
                }
            }
            frequency.add(count);
        }
        System.out.println(copyOfArr);
        System.out.println(frequency);
        for(int i=0;i<copyOfArr.size();i++){
            System.out.println("the frequency of "+ copyOfArr.get(i)+" in given array "+arr + " is "+frequency.get(i));
        }
        s.close();
    }
}
