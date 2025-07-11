public class Day21_Strings {
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // lowercase to handle capital letters

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "hello";
        int result = countVowels(input);
        System.out.println("Number of vowels: " + result);
    }
}

//output:
// Number of vowels: 2
