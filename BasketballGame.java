import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class BasketballGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int noOfPlayers = sc.nextInt();
        int rank = sc.nextInt();
        TreeMap<Integer, String> answer = new TreeMap<>();
        sc.nextLine();
        for (int i = 0; i < noOfPlayers; i++) {
            String name = sc.nextLine();
            double oneP = sc.nextInt();
            double twoP = sc.nextInt();
            double threeP = sc.nextInt();
            double minutesPlayed = sc.nextInt();
            sc.nextLine();
            double scoreSum = oneP + (2 * twoP) + (3 * threeP);
            double points = scoreSum / minutesPlayed;
            if (points >= 1 && points < 10) {
                points = points * 100;
            } else if (points >= 10 && points < 100) {
                points = points * 10;
            } else if (points == 100) {
            } else if (points < 1) {
                points = points * 1000;
            }

            points = Math.round(points);
            int points1 = (int) points;
            answer.put(points1, name);
        }
        ArrayList<Integer> a1 = new ArrayList<>(answer.keySet());
        System.out.println(answer.get(a1.get(noOfPlayers - rank)) + " " + a1.get(noOfPlayers - rank));
    }
}
