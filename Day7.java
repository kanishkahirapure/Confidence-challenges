// public class Day7 {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};
//         int n = arr.length;

//         boolean[] visited = new boolean[n];

//         for (int i = 0; i < n; i++) {
//             if (visited[i] == true) {
//                 continue;
//             }

//             int count = 1;

//             for (int j = i + 1; j < n; j++) {
//                 if (arr[i] == arr[j]) {
//                     count++;
//                     visited[j] = true;
//                 }
//             }

//             System.out.println(arr[i] + " → " + count + " time(s)");
//         }
//     }
// }





// public class Day7{
//     public static void main(String args[]){
//         int arr[] = {1, 2, 3, 4, 5};
//         int sum = 0;

//         for (int i = 0; i < arr.length; i++){
//             if( i % 2 == 0){
//                 sum += arr[i];
//             }
//         }
//         System.out.println("Sum of elements at even indices: " + sum);
//     }
// }




// public class Day7{
//     public static void main(String args[]){
//         int arr[] = {10, 21, 15, 6, 9, 12};
//         int count = 0;
//         for (int i = 0; i < arr.length; i++){
//             if(10 < arr[i]){
//                 count++;
//             }
//         }
//         System.out.println("count = " + count);
//     }
// }



// public class Day7{
//     public static void main(String args[]){
//         int arr[] = {10, 20, 30, 40, 50};
//         int sum = 0;
//         int count = 0;

//         for(int i=0 ; i<arr.length; i++){
//            sum += arr[i];
       
//         }
//            int avg = sum/arr.length;
//            for( int i=0; i<arr.length; i++){
//            if( avg < arr[i]){
//             count++;
//            }
//         }
//         System.out.println("The number of elements in the array which are greater than the average of all elements = "+ count);

//     }
// }



public class Day7{
    public static void main (String args[]){
        int arr[] = {2, 4, 2, 6, 2, 7, 4};
        int target = 2;
        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println("The number of times " + target + " appears in the array is: " + count);
    }
}