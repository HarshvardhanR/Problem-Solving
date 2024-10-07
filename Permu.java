import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Permu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a1 = new ArrayList<>(Arrays.asList(sc.nextLine().split("")));
        ArrayList<String> a2 = new ArrayList<>(Arrays.asList(sc.nextLine().split("")));
        if (a1.size() == 1 && a1.get(0).equals("")) {
            System.out.println("true");
            return;
        }
        int p1 = 0;
        int count = 0;
        while (p1 != a1.size()) {
            int p2 = 0;
            while (p2 != a2.size()) {
                if (a1.get(p1).equals(a2.get(p2))) {
                    count++;
                    a2.remove(p2);
                    break;
                }
                p2++;
            }
            p1++;
        }
        if (count == a1.size()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
