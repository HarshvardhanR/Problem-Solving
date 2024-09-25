import java.util.Scanner;

public class StringOccurence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        int count;
        int[] countArray = new int[x];
        for (int i = 0; i < x; i++) {
            String s = sc.nextLine();
            String s1 = sc.nextLine();

            count = 0;
            int p1 = 0;
            if (s.equals("") || s1.equals("")) {
                countArray[i] = count;
                continue;
            }
            while (p1 != s.length() || p1 != s.length()) {
                if (s.charAt(p1) != s1.charAt(p1)) {
                    break;
                }
                if (s.charAt(p1) == s1.charAt(p1)) {
                    count++;
                }
                p1++;
            }
            countArray[i] = count;
        }
        for (int i = 0; i < countArray.length; i++) {
            System.out.println(countArray[i]);
        }
    }
}
