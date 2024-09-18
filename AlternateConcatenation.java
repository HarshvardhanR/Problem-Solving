import java.util.*;

public class AlternateConcatenation {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();
        int i = 0;
        int j = 0;
        while (i < s1.length() && j < s2.length()) {
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(j));
            i++;
            j++;
        }

        while (i != s1.length()) {
            sb.append(s1.charAt(i));
            i++;
        }

        while (j != s2.length()) {
            sb.append(s2.charAt(j));
            j++;
        }
        String s = sb.toString();
        System.out.println(s);
    }
}