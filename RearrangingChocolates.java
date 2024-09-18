import java.util.*;

public class RearrangingChocolates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        sc.nextLine();
        String s1[] = {};
        if (i1 != 0) {
            s1 = sc.nextLine().split(" ");
        }
        int i2 = sc.nextInt();
        sc.nextLine();
        String s2[] = {};
        if (i2 != 0) {
            s2 = sc.nextLine().split(" ");
        }
        sc.close();
        System.out.println(arranger(i1, s1, s2, i2));
    }

    public static int arranger(int x, String arr[], String arr1[], int y) {
        int s[] = new int[arr1.length];
        int z = 0;
        int pointer = 0;
        int count = 0;
        if (x <= 0) {
            return 0;
        }
        if (x > 0 && y == 0) {
            return -1;
        }
        if (arr.length > 0) {
            for (String i : arr) {
                z += Integer.parseInt(i);
            }
        } else {
            return 0;
        }
        if (arr1.length > 0) {
            for (int k = 0; k < arr1.length; k++) {
                s[k] = Integer.parseInt(arr1[k]);
            }
        } else {
            return -1;
        }
        Arrays.sort(s);
        for (int i = 0; i < s.length / 2; i++) {
            int temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
        while (pointer != s.length) {
            if (z <= 0) {
                break;
            }
            z = z - s[pointer];
            pointer++;
            count++;
        }
        if (z > 0) {
            return -1;
        }
        return count;
    }
}
