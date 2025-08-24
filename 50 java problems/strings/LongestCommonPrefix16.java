
import java.util.Scanner;

// 16.	Find longest common prefix

// Example:
// Input:
// ["flower", "flow", "flight"]
// Step-by-step:
// Compare first letter: all have "f" ✅
// Compare second letter: all have "l" ✅
// Compare third letter: "flower" and "flow" have "o", but "flight" has "i" ❌ → stop.
// Longest common prefix = "fl"
public class LongestCommonPrefix16 {

    public static String [] fillingArray(int size,Scanner s){
        String [] arr=new String[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("enter the "+i+" index element:");
            arr[i]=s.next();
        }
        return arr;
    }
    public static void findLongestCommonPrefix(String [] arr){
        String word1=arr[0];
        String word2=arr[1];
        String word3=arr[2];
        String result="";
        int len=(word1.length()<word2.length()?word1.length():word2.length());
        for(int i=0;i<len-1;i++){
            if(word1.charAt(i)==word2.charAt(i) && word2.charAt(i)==word3.charAt(i)){
                result+=word1.charAt(i);
            }
            // System.out.println(i);
        }
        System.out.println("the longest common prefix in the given string is "+result);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("let take words in array then enter size of array which should 3:");
        int size=s.nextInt();
        String [] arr=fillingArray(size, s);
        findLongestCommonPrefix(arr);
    }
}
