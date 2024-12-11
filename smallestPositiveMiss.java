public class smallestPositiveMiss {
    
    public int missingNumber(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[i] != arr[arr[i] - 1]) {
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public static void main(String[] args) {
        smallestPositiveMiss solution = new smallestPositiveMiss();
        int[] arr1 = {3, 4, -1, 1};
        int[] arr2 = {1, 2, 0};
        int[] arr3 = {7, 8, 9, 11, 12};
        System.out.println(solution.missingNumber(arr1)); // Output: 2
        System.out.println(solution.missingNumber(arr2)); // Output: 3
        System.out.println(solution.missingNumber(arr3)); // Output: 1
    }
}
