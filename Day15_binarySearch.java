// public class Day15_binarySearch{
//     public static int binarySearch(int[] arr, int target) {
//         int start = 0;
//         int end = arr.length - 1;

//         while (start <= end) {
//             int mid = start + (end - start) / 2;

//             if (arr[mid] == target) {
//                 return mid; // target mil gaya
//             } else if (arr[mid] < target) {
//                 start = mid + 1; // right half me jao
//             } else {
//                 end = mid - 1; // left half me jao
//             }
//         }

//         return -1; // target nahi mila
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 4, 6, 8, 10, 12};
//         int target = 10;
//         int index = binarySearch(arr, target);
//         System.out.println("Target found at index: " + index);
//     }
// }



public class Day15_binarySearch {
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid; // target found
            } else if (arr[mid] < target) {
                start = mid + 1; // search in right half
            } else {
                end = mid - 1; // search in left half
            }
        }

        return start; // target not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int target = 10;
        int index = binarySearch(arr, target);
        System.out.println("Target found at index: " + index);
    }
}
