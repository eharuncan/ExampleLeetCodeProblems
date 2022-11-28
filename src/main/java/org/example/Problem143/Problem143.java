package org.example.Problem143;

import org.example.IResolvable;
import org.example.Problem;

public class Problem143 extends Problem implements IResolvable {

    public Problem143() {
        System.out.println("143. Reorder List");
        System.out.println("https://leetcode.com/problems/reorder-list/");
        lineBreak();
    }

    @Override
    public void resolve() {
        int[] input = new int[]{1, 4, 2, 3};
        validate(new int[]{1, 2, 3, 4}, reorderList(input)); ;
    }

    public int[] reorderList (int[] input ) {
        return input;
    }

}
