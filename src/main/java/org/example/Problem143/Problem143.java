package org.example.Problem143;

import org.example.IResolvable;
import org.example.Problem;

public class Problem143 extends Problem implements IResolvable {

    public Problem143() {
        System.out.println("143. Reorder List");
        System.out.println("https://leetcode.com/problems/reorder-list/");
        this.lineBreak();
    }

    @Override
    public void resolve() {

        int[] input = {1,2,3,4};
        int[] expected = {1,4,2,3};

        int[] output = reorderList(input);

        validator(expected, output);
    }

    public int[] reorderList (int[] input ) {
        return input;
    }

}
