// public class Day12 {
//     public static int countEvens(int[] nums){
//         int count = 0;
//         for(int i = 0; i<nums.length; i++){
//             if (nums[i]%2 == 0){
//                 count++;
//             }
//         }
//         return count;
//     }


//     public static void main(String[] args) {
//         int[] nums = {1,2,3,4,5,6,7,8,9,10};
//         int count = countEvens(nums);
//         System.out.println("The count of even numbers in the array is: " + count);
//     }
// }



public class Day12 {
    public static int countGreater(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {  // ✅ Start from 0
            if (arr[i] > target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int[] arr = {4, 7, 2, 9, 5, 8};
        int target = 5;
        int count = countGreater(arr, target);
        System.out.println("Count of elements greater than " + target + ": " + count);
    }
}
