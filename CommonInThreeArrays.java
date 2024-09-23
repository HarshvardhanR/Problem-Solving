import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CommonInThreeArrays {
    public static void main(String[] args) {
        int[] arr1 = { 3, 5, 6, 1 };
        int[] arr2 = { 11, 3, 6, 9 };
        int[] arr3 = { 15, 3, 6, 4 };
        System.out.println(Commoner(arr1, arr2, arr3));
    }

    public static ArrayList<Integer> Commoner(int arr1[], int arr2[], int arr3[]) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        ArrayList<Integer> a1 = new ArrayList<>();

        for (int i : arr1) {
            s1.add(i);
        }
        for (int i : arr2) {
            s2.add(i);
        }
        for (int i = 0; i < arr3.length; i++) {
            if (s1.contains(arr3[i]) && s2.contains(arr3[i])) {
                a1.add(arr3[i]);
            }
        }
        return a1;
    }
}
