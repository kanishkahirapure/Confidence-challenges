public class Day14_linearSearch {
    //linear search
    public static int linearSearch(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i; // return the index of the key
            }
        }
        return -1; // return -1 if key is not found
    }
    public static void main(String args[]){
        int nums[] = {1, 2, 3, 4, 5};
        int key = 10;
        int result = linearSearch(nums, key);
        if (result == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + result);
        }
    }
}