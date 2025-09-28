// public class Day13 {
//     public static void main(String args[]){
//     int rows = 3;
//     int columns = 4;
//            for (int i = 1; i <= rows; i++) { 
//            for (int j = 1; j <= columns; j++) {
//         System.out.print("*");
//     }
//     System.out.println(); // move to next line
// }
// }
// }

    

// public class Day13{
//     public static void main(String args[]){
//         int rows = 5;
//         for (int i = 1; i <= rows; i++) {
//     for (int j = 1; j <= i; j++) {
//         // print j here
//         System.out.print(j + " ");
//     }
//     // move to next line
//   System.out.println();
// }

//     }
// }
// output:
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 

// public class Day13{
//     public static void main(String args[]){
//         int rows = 5;
//         for (int i = 1; i <= rows; i++) {
//     for (int j = 5; j>=i ; j--) { 
//         // print j here
//         System.out.print(j + " ");
//     }
//     // move to next line
//   System.out.println();
// }

//     }
// }

// output:
// 5 4 3 2 1 
// 5 4 3 2 
// 5 4 3 
// 5 4
// 5

// public class Day13 {
//     public static void main(String args[]) {
//         int rows = 5;
//         for (int i = 1; i <= rows; i++) {
//             for (int j = i; j>= 1; j--) {
//                 // print j here
//                 System.out.print(j + " ");
//             }
//             // move to next line
//             System.out.println();
//         }
//     }
// }
// output:
// 1
// 2 1
// 3 2 1
// 4 3 2 1
// 5 4 3 2 1


public class Day13 {
    public static void main(String args[]) {
        int rows = 5;
        // for (int i = 1; i <= rows; i++) {
        //     for (int k = 1; k <= rows - i; k++) {
        //         // print space here
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         // print j here
        //         System.out.print("*");
        //     }
        //     // move to next line
        //     System.out.println();
        //}

        //output
//     *
//    **
//   ***
//  ****
// *****


        for (int i = 1; i <= rows; i++) {
            for (int k = 1; k <= rows - i ; k++){
                System.out .print (" ");
        }
            for (int j = 1; j <= i; j++) {
                // print j here
                System.out.print(j + " ");
            }
            System.out.println();
        }
// output
//     1
//    2 1
//   3 2 1
//  4 3 2 1
// 5 4 3 2 1
    }
}