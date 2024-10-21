import java.util.HashMap;

public class LargestDivisorHashMap {
    public static void main(String args[]) {
        System.out.println(occurenceReturner(10));
    }

    public static HashMap<Integer, Integer> occurenceReturner(int number) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        h1.put(1, 1);
        for (int i = 2; i <= number; i++) {
            int steps = 1;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    if (j > steps) {
                        steps = j;
                    }
                }
            }
            h1.put(i, steps);
        }
        return h1;
    }
}