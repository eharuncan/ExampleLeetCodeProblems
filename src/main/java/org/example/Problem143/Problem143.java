package org.example.Problem143;

import org.example.IDrivable;
import org.example.Problem;

public class Problem143 extends Problem implements IDrivable {

    public Problem143() {
        this.setName("143. Reorder List");
        this.setUrl("https://leetcode.com/problems/reorder-list/");
    }

    @Override
    public void driver() {

        int[] input = {1,2,3,4};
        int[] expected = {1,4,2,3};

        int[] output = reorderList(input);

        validator(expected, output);
    }


    public int[] reorderList (int[] input ) {
        return input;
    }

}
