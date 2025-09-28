// public class Day3 {
//     public static void main(String args[]){
//         int[] arr = {1, 2, 3, 4, 5};
        
//         for(int i=arr.length-1 ; i>=0 ; i--){
//             System.out.println(arr[i]);
//         }
//     }
// }
// output: 5
// 4
// 3
// 2
// 1

// public class Day3{
//     public static void main(String args[]){
//         int[] arr = {4, 7, 1, 9, 3, 8};
//         int x = 5;
//         int count = 0;
//         for(int i=1; i<arr.length; i++){
//             if(x<arr[i]){
//                 count++;
//             }

//         }

//         System.out.println("count :" + count);

//     }
// }
// // output:count :3

import java.util.Scanner;

class Day3{

    // Function jo max element return karega
    public static int findMax(int arr[]) {
        int max = arr[0];   // pehle element ko max maan lo

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];   // agar bada element mila to update kar do
            }
        }

        return max;   // function result return karega
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = findMax(arr);   // function call
        System.out.println("Maximum element in array is: " + max);

        sc.close();
    }
}
