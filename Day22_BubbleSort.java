// public class Day22_BubbleSort {
//     public static void bubbleSort(int[] arr) {
//         int n = arr.length;
//         boolean swapped;
        
//         for (int i = 0; i < n - 1; i++) {  //arr.length = n = 5,i = 0 se 3 tak chalega i.e. total 4 times (0, 1, 2, 3)
//             swapped = false;
//             for (int j = 0; j < n - i - 1; j++) { 
                    
                      //j < 5 - 1 - 0 → j < 4
                    //So j = 0, 1, 2, 3 → ✅ 4 comparisons
                    // j < 5 - 1 - 1 → j < 3
                    //So j = 0, 1, 2 → ✅ 3 comparisons
                    // j < 5 - 1 - 2 → j < 2
                    //So j = 0, 1 → ✅ 2 comparisons
                    // j < 5 - 1 - 3 → j < 1
                    //So j = 0 → ✅ 1 comparison

//                 if (arr[j] > arr[j + 1]) {      ////Ye adjacent elements compare karta hai
//                     // swap arr[j] and arr[j+1]
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                     swapped = true;
//                 }
//             }
//             // If no two elements were swapped in the inner loop, then break
//             if (!swapped) {
//                 break;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {64, 34, 25, 12, 22, 11, 90};
//         bubbleSort(arr);
//         System.out.println("Sorted array: ");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }



public class Day22_BubbleSort {

    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;

        for ( int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if (arr[j] <arr [j + 1]) {// reverse condition for bubbleSortDescending
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        int [] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSortDescending(arr);
        System.out.println("Sorted array in descending order: ");
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
