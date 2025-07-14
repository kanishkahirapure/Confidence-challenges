// Count Vowels in a String


// public class Day21_Strings {
//     public static int countVowels(String str) {
//         int count = 0;
//         str = str.toLowerCase(); // lowercase to handle capital letters

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             // check if character is a vowel
//             if (ch == 'a' || ch == 'e' || ch == 'i' ||
//                 ch == 'o' || ch == 'u') {
//                 count++;
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         String input = "hello";
//         int result = countVowels(input);
//         System.out.println("Number of vowels: " + result);
//     }
// }

//output:
// Number of vowels: 2



//Reverse a String

// public class Day21_Strings {
//     public static String reverseString(String str) {
//         StringBuilder reversed = new StringBuilder(str);
//         return reversed.reverse().toString();
//     }

//     public static void main(String[] args) {
//         String input = "hello";
//         String result = reverseString(input);
//         System.out.println("Reversed string: " + result);
//     }
// }

// Output:
// Reversed string: olleh

// Alternative method to reverse a string using a loop

// public class ReverseString {
//     public static String reverse(String str) {
//         String rev = "";
//         for (int i = str.length() - 1; i >= 0; i--) {
//             rev += str.charAt(i); // add characters in reverse order
//         }
//         return rev;
//     }

//     public static void main(String[] args) {
//         String input = "kanishka";
//         String output = reverse(input);
//         System.out.println("Reversed string: " + output);
//     }
// }



// Check Palindrome


// public class Day21_Strings {
//     public static boolean isPalindrome(String str) {
//         String reversed = new StringBuilder(str).reverse().toString();
//         return str.equals(reversed);
//     }

//     public static void main(String[] args) {
//         String input = "madam";
//         boolean result = isPalindrome(input);
//         System.out.println("Is palindrome: " + result);
//     }
// }




public class Day21_Strings {
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Is palindrome: " + isPalindrome(input));
    }
}
