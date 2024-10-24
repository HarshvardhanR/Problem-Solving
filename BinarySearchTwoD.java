public class BinarySearchTwoD {
    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        System.out.println(binary(arr, 8));
    }

    public static boolean binary(int arr[][], int target) {
        int i = 0;
        int j = arr[0].length - 1;
        while (i < arr.length && j > 0) {
            if (target == arr[i][j]) {
                System.out.println(i + " " + j);
                return true;
            } else if (target > arr[i][j]) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
