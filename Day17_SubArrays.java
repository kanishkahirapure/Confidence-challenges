public class Day17_SubArrays {
    public static void printSubarrays(int[] arr) {
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                // Print subarray from start to end
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println(); // next line after each subarray
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printSubarrays(arr);
    }
}


// output
// 1 
// 1 2 
// 1 2 3 
// 2 
// 2 3 
//3


// public static void printSubarrays(int numbers[]){
    //     int ts = 0;
    //     for(int i=0; i<numbers.length; i++){
    //         int start = i;
    //         for(int j=i; j<numbers.length; j++){
    //             int end = j;
    //             for(int k=start; k<=end; k++){//print
    //                 System.out.print(numbers[k]+" ");//subarrays
    //             }
    //             ts++;
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }

    //     System.out.println("total subarrays ="+ ts);
    // }

    // public static void main(String args[]){
    //     int numbers[] = {2, 4, 6, 8, 10};
    //     printSubarrays(numbers);
    // }
