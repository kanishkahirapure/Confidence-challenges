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


// public static void printPairs(int numbers[]){
    //     int tp = 0; //total pairs;
    //     for(int i=0; i<numbers.length; i++){
    //         int curr = numbers[i];  //1, 2, 3, 4, 5
    //         for(int j=i+1; j<numbers.length; j++){
    //             System.out.print("(" + curr + "," + numbers[j] + ")");
    //             tp++;
    //         }

    //         System.out.println();
    //     }
    //     System.out.println("Total pairs are : " + tp);
    // }
    // public static void main(String args[]){
    //     int numbers[] = {1, 2, 3, 4, 5};
    //     printPairs(numbers);
    // }



//reverse

//     public static void reverse(int number[]){
//         int first = 0, last = number.length-1;

//         while(first < last){
//             //swap
//             int temp = number[last];
//             number[last] = number[first];
//             number[first] = temp;

//             first++;
//             last--;
//         }
//     }

//     public static void main(String args[]){
//         int number[] = {1, 2, 3, 4, 5};
//         reverse(number);

//         //print
//         for(int i=0; i<number.length; i++){
//             System.out.print(number[i] + " ");
//         }

//         System.out.println();
//     }