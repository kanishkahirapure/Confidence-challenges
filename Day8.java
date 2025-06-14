// public class Day8 {
//     public static void main (String args[]){
//         int[] arr = {4, 3, 7, 2, 4, 3, 6, 2, 4};

//         for (int i=0; i<arr.length; i++){
//             boolean alreadyPrinted = false;

//             for(int k=0; k<i; k++){
//                 if (arr[k] == arr[i]){
//                     alreadyPrinted = true;
//                     break; // No need to check further if already printed
//                 }
//             }
//                 if (alreadyPrinted) continue;
//                 for(int j=i+1; j<arr.length; j++){
//                 if(arr[i] == arr[j]){
//                     System.out.println("Duplicate element: " + arr[i]);
//                     break; 
//                 }

                
//             }
//         }
//     }
// }



public class Day8{
    public static void main(String args[]){
        int [] arr = {5, 3, 8, 1, 4};
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < firstSmallest){
                secondSmallest = firstSmallest;
                // secondSmallest = firstSmallest → secondSmallest = 5
                // firstSmallest = 3
                firstSmallest = arr[i];
            }else if (arr[i] < secondSmallest && arr[i]!= firstSmallest) {
                secondSmallest = arr[i];
            }

            if (arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i];
        }
        
    }
    System.out.println("first smallest = "+ firstSmallest);
        System.out.println("second smallest = "+ secondSmallest);
        System.out.println("first largest = "+ firstLargest);
        System.out.println("second largest = "+ secondLargest);
}
}



// public class Day8{
//     public static void main (String args[]){
//         int [] arr = {5, 1, 9, 3, 7};
//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;

//         for(int i = 0; i < arr.length; i++){
//             if (arr[i]<min){
//                 min = arr[i];
                
//             }
//             if (arr[i]>max){
//                 max = arr[i];
//             }
//         }
//         System.out.println("Minimum = " + min);
//         System.out.println("Maximum = " + max);
//         System.out.println("Difference = "+ (max - min));
        
//     } 
// }


// public class Day8{
//     public static void main(String args[]){
//         int [] arr = {3, 7, 1, 9,  2};
//         int target = 7;
//         int i = 0;

//         for(i = 0; i < arr.length; i++){
//             if (arr[i] == target){
//                 break; // Exit the loop when the target is found
//             }
        
//         }
//         System.out.println("Element found at index: " + i);
//     }
// }
// output  = Element found at index: 1


