// public class Day5 {
//     public static void main(String args[]){
//         int[] arr = {5, 10 , 15, 20, 25};
//         int evenSum = 0;
//         int oddSum = 0;
        
//         for(int i=1; i<arr.length; i++){    
//             if( i %2 == 0){
//                 evenSum += arr[i];
//             }else{
//                 oddSum += arr[i];
//             }
//        }
//         System.out.println("Sum of even numbers = " + evenSum);
//         System.out.println("Sum of odd numbers = " + oddSum);
//     }
// }


public class Day5{
    public static void main(String args[]){
        int[] arr = {5, 10, 15, 20, 25};
        int evenIndexSum = 0;
        int oddIndexSum = 0;
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                evenIndexSum += arr[i];
            } else {
                oddIndexSum += arr[i];
            }
        }

        System.out.println("Sum of elements at even indices = " + evenIndexSum);
        System.out.println("Sum of elements at odd indices = " + oddIndexSum);
    }
}
