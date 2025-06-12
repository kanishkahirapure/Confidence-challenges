// public class Day6 {
//     public static void main(String args[]){
//         int[] arr = {1, 2, 3, 4, 5};

//         for(int i = arr.length-1; i>=0; i--){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


public class Day6 {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5};

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.print("Reversed array: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}

