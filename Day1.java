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