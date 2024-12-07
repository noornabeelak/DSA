import java.util.Arrays;
public class minHeight {
    int getMinDiff(int[] arr, int k) {
        Arrays.sort(arr);
        int min=arr[0]+k;
        int max=arr[arr.length-1]-k;
        return max-min;

       
    }

    public static void main(String[]args){
        int[] arr={1, 5, 8, 10};
        int k = 2;
        minHeight obj=new minHeight();
        System.out.println(obj.getMinDiff(arr, k));
    }
}

//WORST CASE ANSWER
class Solution {
    public int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        List<int[]> modifiedHeights = new ArrayList<>();
        int[] frequency = new int[n];

        // Generate all possible modified heights
        for (int i = 0; i < n; i++) {
            if (arr[i] - k >= 0) {
                modifiedHeights.add(new int[]{arr[i] - k, i});
            }
            modifiedHeights.add(new int[]{arr[i] + k, i});
        }

        // Sort the modified heights
        modifiedHeights.sort(Comparator.comparingInt(a -> a[0]));

        int left = 0, right = 0, covered = 0, minDifference = Integer.MAX_VALUE;

        // Sliding window to find the minimum difference
        while (right < modifiedHeights.size()) {
            if (frequency[modifiedHeights.get(right)[1]]++ == 0) {
                covered++;
            }

            while (covered == n) {
                minDifference = Math.min(minDifference, 
                    modifiedHeights.get(right)[0] - modifiedHeights.get(left)[0]);

                if (--frequency[modifiedHeights.get(left)[1]] == 0) {
                    covered--;
                }
                left++;
            }
            right++;
        }

        return minDifference;
    }
}
