public class Day18_MaxSubarraySum {
    public static void maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int start = 0; start < arr.length; start++) {
            int currentSum = 0;

            for (int end = start; end < arr.length; end++) {
                currentSum += arr[end];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Maximum subarray sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubarraySum(arr);
    }
}
