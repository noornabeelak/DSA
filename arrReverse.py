class Solution:
    def reverseArray(self, arr):
        n = len(arr)
        for i in range(n // 2):  # Use integer division for the range
            temp = arr[i]
            arr[i] = arr[n - i - 1]
            arr[n - i - 1] = temp
        return arr  # Return the reversed array

if __name__ == "__main__":
    arr = [1, 2, 3, 4, 5]  # Assume the array is provided
    solution = Solution()
    reversed_array = solution.reverseArray(arr)
    print(reversed_array)
