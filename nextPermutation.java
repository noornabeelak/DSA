public class nextPermutation {
    void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n - 2, j = n - 1;

        while (i >= 0 && arr[i] >= arr[i + 1])
            i--;

        if (i >= 0) {
            while (arr[j] <= arr[i])
                j--;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        reverse(arr, i + 1, n - 1);
    }

    void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
}
