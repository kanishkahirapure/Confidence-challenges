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

public class Day3{
    public static void main(String args[]){
        int[] arr = {4, 7, 1, 9, 3, 8};
        int x = 5;
        int count = 0;
        for(int i=1; i<arr.length; i++){
            if(x<arr[i]){
                count++;
            }

        }

        System.out.println("count :" + count);

    }
}
// output:count :3