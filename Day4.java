// public class Day4 {
//     public static void main(String args[]){
//         int[] arr = {12, 45, 23, 67, 34};
//         int first = 0;
//         int second = 0;

//         for(int i=0; i<arr.length; i++){
//             if(arr[i]>first){
//              //   second = first;
//                 first = arr[i];
//             }else if (arr[i]>second && arr[i]!=first){
//                 second = arr[i];
//             }
//         }
//         System.out.println("second largest = "+ second);
//     }
// }



import java.util.Scanner;

class Day4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();   // user input

        int reverse = 0;   // reversed number store karne ke liye
        int original = num; // original number ko store karenge (agar palindrome check karna ho)

        while (num > 0) {
            int lastDigit = num % 10;       // last digit nikaalo
            reverse = (reverse * 10) + lastDigit; // digit add karo reverse me
            num = num / 10;                 // number chhota karo
        }

        System.out.println("Reverse of " + original + " is: " + reverse);

        sc.close();
    }
}
