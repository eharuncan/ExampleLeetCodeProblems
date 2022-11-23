package org.example.Problem6;

import org.example.IResolvable;
import org.example.Problem;

public class Problem6 extends Problem implements IResolvable {

    public Problem6() {
        System.out.println("6. Zigzag Conversation");
        System.out.println("https://leetcode.com/problems/zigzag-conversion/");
        this.lineBreak();
    }

    @Override
    public void resolve() {

        String input = "PAYPALISHIRING";
        int numRows = 4;
        String expected = "PINALSIGYAHRPI";
        String output = convert(input, numRows); // Calls your implementation

        validator(expected, output);
    }

    private String convert(String s, int numRows) {
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

}
