import java.util.*;

public class SnakeGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int noOfEntities = sc.nextInt();
        HashMap<Integer, Integer> Ladder = new HashMap<>();
        HashMap<Integer, Integer> Snake = new HashMap<>();
        ArrayList<Integer> Moves = new ArrayList<>();
        for (int i = 0; i < noOfEntities; i++) {
            int input = sc.nextInt();
            int input2 = sc.nextInt();
            if (input < input2) {
                Ladder.put(input, input2);
            } else {
                Snake.put(input, input2);
            }
        }
        int noOfMoves = sc.nextInt();
        for (int i = 0; i < noOfMoves; i++) {
            int x = sc.nextInt();
            Moves.add(x);
        }
        int PlayerA = 1;
        int PlayerB = 1;
        for (int i = 0; i < Moves.size(); i++) {
            if (i % 2 == 0) {
                PlayerA = PlayerA + Moves.get(i);
                while (Ladder.containsKey(PlayerA) || Snake.containsKey(PlayerA)) {
                    if (Ladder.containsKey(PlayerA)) {
                        PlayerA = Ladder.get(PlayerA);
                    }
                    if (Snake.containsKey(PlayerA)) {
                        PlayerA = Snake.get(PlayerA);
                    }
                }
                System.out.println("A" + PlayerA);
            } else {
                PlayerB = PlayerB + Moves.get(i);
                while (Ladder.containsKey(PlayerB) || Snake.containsKey(PlayerB)) {
                    if (Ladder.containsKey(PlayerB)) {
                        PlayerB = Ladder.get(PlayerB);
                    }
                    if (Snake.containsKey(PlayerB)) {
                        PlayerB = Snake.get(PlayerB);
                    }
                }
                System.out.println("B" + PlayerB);
            }
        }
        if (PlayerA > PlayerB) {
            System.out.println("A " + PlayerA);
        } else {
            System.out.println("B " + PlayerB);
        }
    }
}
