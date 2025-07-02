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

//output:Maximum subarray sum is: 6



 //public static void maxSubarraySum(int numbers[]){
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int [numbers.length];

//         prefix[0] = numbers[0];
//         //calculare prefix array
//         for(int i=1; i<prefix.length; i++){
//             prefix[i] = prefix[i-1] + numbers[i];
//         }

//         for(int i=0; i<numbers.length; i++){
//             int start = i;
//             for(int j=i; j<numbers.length; j++){
//                 int end = j;

//                 currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

//                 if(maxSum < currSum){
//                     maxSum = currSum;
//                 }
//             }
//         }

//         System.out.println("Max sum ="+ maxSum);
//     }
