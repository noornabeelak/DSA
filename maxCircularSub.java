
public class maxCircularSub {
    static int maxCircularSum(int[] arr) {
        int n = arr.length;
        int maxKadane = kadane(arr);

        int maxWrap = 0;
        for (int i = 0; i < n; i++) {
            maxWrap += arr[i];
            arr[i] = -arr[i];
        }

        maxWrap = maxWrap + kadane(arr);

        if (maxWrap > maxKadane && maxWrap != 0)
            return maxWrap;
        else
            return maxKadane;
    }

    static int kadane(int[] arr) {
        int currentMax = 0;
        int globalMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currentMax += arr[i];
            if (globalMax < currentMax)
                globalMax = currentMax;
            if (currentMax < 0)
                currentMax = 0;
        }
        return globalMax;
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 3, 4, -1};
        System.out.println(maxCircularSum(arr));
    }
}
