// public class Day19_Kadanes {
//     public static void maxSubarraySum(int[] arr) {
//         int maxSum = Integer.MIN_VALUE;
//         int currentSum = 0;

//         for (int num : arr) {
//             currentSum += num;
//             if (currentSum > maxSum) {
//                 maxSum = currentSum;
//             }
//             if (currentSum < 0) {
//                 currentSum = 0; // Reset current sum if it drops below zero
//             }
//         }

//         System.out.println("Maximum subarray sum is: " + maxSum);
//     }

//     public static void main(String[] args) {
//         int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//         maxSubarraySum(arr);
//     }
// }


//both code do same work 


public class Day16_Kadanes {
    public static int kadanes(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = kadanes(arr);
        System.out.println("Maximum subarray sum is: " + result);
    }
}
