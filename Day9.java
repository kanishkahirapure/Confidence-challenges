// Create a method that takes an array of integers and returns the count of even numbers in it.



// public class Day9 {
//     public static void main(String args[]){
//         int[] arr = {1, 4, 6, 8, 9};
        
//         int result = countEvens(arr);
//         System.out.println("Count of even numbers: " + result);
//     }

//     //method to count even numbers in an array
//     public static int countEvens(int[] arr){
//         int count = 0;

//         for(int i = 0; i < arr.length; i++){
//             if(arr[i] % 2 == 0){
//                 count++;
//             }
//         }

//         return count;
//     }
// }



// public class Day9{
//     public static void main(String args[]){
//         int[] arr = {1, 4, 6, 8, 9};
        
//         int sum = getSum(arr);

//         if(sum % 2 == 0){
//             System.out.println("Sum is even : " + sum);
//         }else {
//             System.out.println("Sum is odd : " + sum);
//         }

//     }

//     public static int getSum(int[] arr){
//         int sum =0;

//         for(int i=0; i<arr.length; i++){
//             sum += arr[i];
    
//         }

//         return sum;
//     }
// }


// public class Day9{
//     public static void main(String args[]){
//         int[] arr = {1, 2, 4, 6, 8, 9};
//         int result = getSum(arr);
//         System.out.println("Odd index sum " + result);

//     }

//     public static int getSum(int[] arr){
//         int oddIndexSum = 0;
       

//         for(int i=0; i< arr.length; i++){
//             if (i %2 !=0){
//                 oddIndexSum += arr[i];
//             } 
//         }
//         return oddIndexSum;
//     }
// }




public class Day9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4}; // Sum = 10 → Even → true

        boolean result = isSumEven(arr);
        System.out.println("Sum is Even: " + result);
    }

    public static boolean isSumEven(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum % 2 == 0;
    }
}
