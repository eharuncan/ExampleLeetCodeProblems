package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        problem1Driver();
        System.out.println("");
        problem2Driver();
        System.out.println("");
        problem3Driver();
    }

    private static void validate(Object object1, Object object2) {
        System.out.println(object1);
        System.out.println(object2);

        if (Objects.equals(object1, object2)) {
            System.out.println("Başarılı");
        } else {
            System.out.println("Başarısız");
        }
    }

    static int[] nums = {1, 1, 1, 2, 2, 3};
    private static void problem1Driver() {

        // 80. Remove Duplicates from Sorted Array II
        // https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

        int[] expectedNums = {1, 1, 2, 2, 3};

        int k = removeDuplicates(nums); // Calls your implementation

        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            resultList.add(nums[i]);
        }

        validate(resultList.toString(), Arrays.toString(expectedNums));
    }

    private static int removeDuplicates(int[] nums) {
        int bulunma_sayisi = 0;
        int yazilacak_index = 0;

        if (nums.length > 2) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[yazilacak_index] == nums[i]) {
                    bulunma_sayisi++;
                    if (bulunma_sayisi < 2) yazilacak_index++;
                } else {
                    yazilacak_index++;
                    bulunma_sayisi = 0;
                }
                nums[yazilacak_index] = nums[i];
            }
            return yazilacak_index + 1;
        } else {
            return nums.length;
        }
    }

    private static void problem2Driver() {

        // 6. Zigzag Conversation
        // https://leetcode.com/problems/zigzag-conversion/

        String input = "PAYPALISHIRING";
        int numRows = 4;
        String expected = "PINALSIGYAHRPI";
        String output = convert(input, numRows); // Calls your implementation

        validate(expected, output);
    }

    private static String convert(String s, int numRows) {
        if (s == null || s.isEmpty() || numRows <= 0) return ""; // Base conditions
        if (numRows == 1) return s;

        StringBuilder result = new StringBuilder(); // Resultant string
        int step = 2 * numRows - 2; // Step size
        for (int i = 0; i < numRows; i++) { // Loop for each row
            for (int j = i; j < s.length(); j += step) { // Loop for each character in the row
                result.append(s.charAt(j));
                if (i != 0 && i != numRows - 1 && (j + step - 2 * i) < s.length()) {
                    result.append(s.charAt(j + step - 2 * i));
                }
            }
        }
        return result.toString();
    }

    private static void problem3Driver() {

        // 143. Reorder List
        // https://leetcode.com/problems/reorder-list/

        int[] input = {1,2,3,4};
        int[] expected = {1,4,2,3};

        int[] output = reorderList(input);

        validate(expected, output);
    }


    public static int[] reorderList (int[] input ) {


    }


}






