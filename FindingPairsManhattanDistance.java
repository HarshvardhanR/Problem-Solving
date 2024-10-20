public class FindingPairsManhattanDistance {
    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3 },
                { 1, 4, 6 },
                { 7, 8, 2 } };

        System.out.println(findPairs(arr, 2));
    }

    public static int findPairs(int[][] arr, int toBeFound) {
        int firstLocI = -1;
        int firstLocJ = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == toBeFound) {
                    if (firstLocI == -1) {
                        firstLocI = i;
                        firstLocJ = j;
                    } else {
                        return Math.abs(i - firstLocI) + Math.abs(j - firstLocJ);
                    }
                }
            }
        }
        return -1;
    }
}