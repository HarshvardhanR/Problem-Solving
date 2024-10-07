import java.util.Scanner;

public class Loadtime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String arr[] = sc.nextLine().split(" ");
        int answer[] = new int[arr.length];
        int a[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }
        int p1 = 0;
        while (p1 != a.length) {
            int p2 = p1 - 1;
            answer[p1] = 1;
            while (p2 >= 0) {
                if (a[p2] <= a[p1]) {
                    answer[p1]++;
                    p2--;
                } else {
                    break;
                }
            }
            p1++;
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
        System.out.println();
        int globalCounter = 0;
        int p3 = 0;

        while (p3 != answer.length) {
            int p4 = p3 + 1;
            int currCounter = 1;
            while (p4 != answer.length) {
                if (answer[p4] > answer[p3]) {
                    currCounter++;
                    p4++;
                } else {
                    break;
                }
            }
            if (currCounter > globalCounter) {
                globalCounter = currCounter;
            }
            p3++;
        }
        System.out.println(globalCounter);

    }
}