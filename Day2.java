// public class Day2 {
    // public static void main(String args[]){
    //     int[] arr = {3, 7, 2, 9, 5};
    //     int max = arr[0];

    //     for(int i=0; i<arr.length; i++){
    //         if (arr[i] > max){
    //             max = arr[i];
    //         }
    //     }

    //     System.out.println("Maximum value = " + max);
    // }
//}
//output: Maximum value = 9


public class Day2{
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 6};

        int evenCount = 0;
        int oddCount = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 ==0){
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even count = " + evenCount);
        System.out.println("Odd count = " + oddCount);

    }
}
//Even count = 3
//Odd count = 2