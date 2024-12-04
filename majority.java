
import java.util.*;
public class majority {
    public static List<Integer> findElements(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int n = arr.length;
        int threshold = n / 3;

        // Step 1: Count frequencies of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Add elements to the result that occur more than n/3 times
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > threshold) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        List<Integer> result = findElements(arr);
        System.out.println(result); // Output: [5, 6]
    }
}


