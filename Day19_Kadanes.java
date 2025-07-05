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


// or this code , both code are doing same work

public class Day19_Kadanes {
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



//public static void kadanes(int numbers[]){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for(int i=0; i<numbers.length; i++){
//             cs = cs + numbers[i];
//             if(cs < 0){
//                 cs = 0;
//             }
//             ms = Math.max(cs, ms);
//         }

//         System.out.println("our max subarray sum is : "+ ms);
//     }

//     public static void main(String args[]){
//         int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//         kadanes(numbers);
//     }


// Q2. Find the Start and End Index of Maximum Sum Subarray

// public class Day19_Kadanes {
//     public static int kadanes(int[] arr) {
//         int maxSum = Integer.MIN_VALUE;
//         int currSum = 0;

//         int start = 0;         // Final subarray start index
//         int end = 0;           // Final subarray end index
//         int tempStart = 0;     // Temporary start index

//         for (int i = 0; i < arr.length; i++) {
//             currSum += arr[i];

//             if (currSum > maxSum) {
//                 maxSum = currSum;
//                 start = tempStart;
//                 end = i;
//             }

//             if (currSum < 0) {
//                 currSum = 0;
//                 tempStart = i + 1;
//             }
//         }

//         // Print the subarray
//         System.out.print("Subarray with max sum: ");
//         for (int i = start; i <= end; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();

//         System.out.println("Start index = " + start);
//         System.out.println("End index = " + end);

//         return maxSum;
//     }

//     public static void main(String[] args) {
//         int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//         int result = kadanes(arr);
//         System.out.println("Maximum subarray sum is: " + result);
//     }
// }


// output

// Subarray with max sum: 4 -1 2 1 
// Start index = 3  
// End index = 6  
// Maximum subarray sum is: 6





