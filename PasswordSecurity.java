import java.util.*;

public class PasswordSecurity {
    public static void main(String args[]) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        String s1 = "";
        for (int i = 0; i < s; i++) {
            s1 = sc.next();
            arr.add(s1);
        }
        sc.close();
        boolean small = false;
        boolean large = false;
        boolean digit = false;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() == 10) {
                if (arr.get(i).contains("@") || arr.get(i).contains("#") || arr.get(i).contains("$")
                        || arr.get(i).contains("%") || arr.get(i).contains("&") || arr.get(i).contains("*")) {
                    for (int j = 0; j < arr.get(i).length(); j++) {
                        if (Character.isDigit(arr.get(i).charAt(j))) {
                            digit = true;
                        } else if (Character.isUpperCase(arr.get(i).charAt(j))) {
                            large = true;
                        } else if (Character.isLowerCase(arr.get(i).charAt(j))) {
                            small = true;
                        }
                    }
                    if (small && large && digit) {
                        System.out.println(arr.get(i));
                        count = count + 1;
                    }
                }

            }

        }
        System.out.println(count);

    }
}
