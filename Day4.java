public class Day4 {
    public static void main(String args[]){
        int[] arr = {12, 45, 23, 67, 34};
        int first = 0;
        int second = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>first){
             //   second = first;
                first = arr[i];
            }else if (arr[i]>second && arr[i]!=first){
                second = arr[i];
            }
        }
        System.out.println("second largest = "+ second);
    }
}
