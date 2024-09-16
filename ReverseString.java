import java.util.Scanner;

public class ReverseString {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str[] = s.split(" ");
        for (int i = 0; i < str.length; i++) {
            String s1 = (reverse(str[i]));
            if (i == str.length - 1) {
                sb.append(s1);
            } else {
                sb.append(s1 + " ");
            }
        }
        System.out.println(sb.toString());
    }

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
