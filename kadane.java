public class kadane {
    //finding the max consucutive sub array;
    public static int maxSubArray(int[] arr){
        if(arr==null|| arr.length==0){
            return 0;
        }

        int currentMax=arr[0];
        int globalMax=arr[0];
        int n=arr.length;

        for(int i=1;i<n;i++){
            currentMax=Math.max(arr[i],currentMax+arr[i]);

            if (currentMax>globalMax){
                globalMax=currentMax;
            }
        }
        return globalMax;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubArray(arr);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
    
}
