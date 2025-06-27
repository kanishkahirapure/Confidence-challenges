// public class Day16_PairsInArray {

//     public static void printPairs(int arr[] ){
//         for(int i = 0; i< arr.length; i++){
//             for(int j = i+1; j<arr.length; j++){
//                 System.out.println(arr[i] + ", " + arr[j]);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4};
//         printPairs(arr);
//     }
// }
//output:
// 1, 2 
// 1, 3
// 1, 4
// 2, 3
// 2, 4
// 3, 4


public class Day16_PairsInArray {
    public static int printPairs(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println(arr[i] + ", " + arr[j]);
                count++;
            }
        }
        return count;
    }
        
    

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int count = printPairs(arr);
        System.out.println("Total pairs: " + count);
    }
}