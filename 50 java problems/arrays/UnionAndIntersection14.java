
import java.util.ArrayList;
import java.util.Arrays;


// 🔹 Union of Two Arrays
// 👉 Definition: Union means combining all the unique elements from both arrays (no duplicates).
// Steps (without code):
// Take all elements from the first array.
// Add all elements from the second array.
// Remove duplicates so that only unique elements remain.
// ✅ Example:
// Array A = {1, 2, 3, 4}
// Array B = {3, 4, 5, 6}
// Union = {1, 2, 3, 4, 5, 6}

// 🔹 Intersection of Two Arrays
// 👉 Definition: Intersection means finding the common elements present in both arrays.
// Steps (without code):
// Compare elements of the first array with the second array.
// Keep only the elements that are present in both.
// Avoid duplicates if repeated.
// ✅ Example:
// Array A = {1, 2, 3, 4}
// Array B = {3, 4, 5, 6}
// Intersection = {3, 4}


public class UnionAndIntersection14{
    public static ArrayList<Integer> addingelements(ArrayList<Integer> arrayList1, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arrayList1.add(arr[i]);
        }
        return arrayList1;
}
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arrayList1){
        for(int i=0;i<arrayList1.size();i++){
            for(int j=i+1;j<arrayList1.size();j++){
                if(arrayList1.get(i)==arrayList1.get(j)){
                    arrayList1.remove(j);
                }
            }
        }
        return arrayList1;
    }
    public static void union(int [] a,int [] b){
        ArrayList<Integer>union=new ArrayList<>();
        union=addingelements(union, a);
        union=addingelements(union, b);
        union=removeDuplicates(union);
        System.out.println("the union of two arrays is "+union);

    }
   public static void intersection(int[] a, int[] b) {
    System.out.print("The intersection of two arrays: ");
    for (int i = 0; i < a.length; i++) {
        int current = a[i];  // make it effectively final
        if (Arrays.stream(b).anyMatch(x -> x == current)) {
            System.out.print(current + " ");
        }
    }
}
    public static void main(String[] args) {
        int [] A={1, 2, 3, 4};
        int [] B={3, 4, 5, 6};
        union(A, B);
        intersection(A, B);

    }
}