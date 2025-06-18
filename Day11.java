// public class Day11 {
//     public static int sum ( int a, int b ) {
//         return a + b;
//     }
//     public static void main( String args[]){
//         int a = 5;
//         int b = 10;
//         int result = sum(a, b); 
//         System.out.println("The sum of " + a + " and " + b + " is: " + result);
//     }
// }


public class Day11{
    public static boolean isEven(int num){
        return num%2 == 0;
    }

    public static void main(String[] args){
        int num = 10;
        if(isEven(num)){
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }
}
