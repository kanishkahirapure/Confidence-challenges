public class Day1 {
    public static void main(String args[]) {
        int[] arr = {2, 4, 6, 8};
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}
// Output: Sum = 20


// import java.util.Scanner;

// class Day1 {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();   // user input

//         // loop to print table
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(num + " x " + i + " = " + (num * i));
//         }

//         sc.close(); // good practice
//     }
// }
