import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int arr[][] = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int a1[] = new int[rows * columns];
        int counter = 0;
        int m = 0;
        while (a1[a1.length - 1] == 0) {
            for (int i = m; i < columns; i++) {
                if (a1[a1.length - 1] != 0) {
                    break;
                }
                a1[counter] = arr[m][i];
                counter++;
            }
            for (int i = m + 1; i < rows; i++) {
                if (a1[a1.length - 1] != 0) {
                    break;
                }
                a1[counter] = arr[i][columns - 1];
                counter++;
            }
            for (int i = columns - 2; i >= m; i--) {
                if (a1[a1.length - 1] != 0) {
                    break;
                }
                a1[counter] = arr[rows - 1][i];
                counter++;
            }
            for (int i = rows - 2; i > m; i--) {
                if (a1[a1.length - 1] != 0) {
                    break;
                }
                a1[counter] = arr[i][m];
                counter++;
            }
            m++;
            rows--;
            columns--;
        }
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }
    }
}
