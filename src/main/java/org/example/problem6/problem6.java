package org.example.problem6;

import java.util.Objects;

public class problem6 {

    public static void driver() {

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

    private static void validate(Object object1, Object object2) {
        System.out.println(object1);
        System.out.println(object2);

        if (Objects.equals(object1, object2)) {
            System.out.println("Başarılı");
        } else {
            System.out.println("Başarısız");
        }
    }
}
