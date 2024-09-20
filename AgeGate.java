import java.util.Scanner;

public class AgeGate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int noOfStud = sc.nextInt();
        sc.nextLine();
        String answer[] = new String[noOfStud];
        for (int i = 0; i < noOfStud; i++) {
            String s[] = sc.nextLine().split(" ");
            int date = Integer.parseInt(s[0]);
            int month = Integer.parseInt(s[1]);
            int year = Integer.parseInt(s[2]);

            if (2022 - year > 13) {
                answer[i] = "old enough";
            } else if (2022 - year < 13) {
                answer[i] = "too young";
            } else {
                if (month < 4) {
                    answer[i] = "old enough";
                } else if (month > 4) {
                    answer[i] = "too young";
                } else {
                    if (date < 18) {
                        answer[i] = "old enough";
                    } else if (date > 18) {
                        answer[i] = "too young";
                    } else {
                        answer[i] = "old enough";
                    }
                }

            }

        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
