class Solution {

    public static boolean check(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
            }
        }

        // Check the last and first element
        if (arr[arr.length - 1] > arr[0]) {
            count++;
        }

        return count <= 1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};

        System.out.println("The Given array is Sorted and Rotated = " + check(arr));
    }
}