package org.example.Problem143;

import org.example.IResolvable;
import org.example.Problem;

import java.sql.Array;

public class Problem143 extends Problem implements IResolvable {

    public Problem143() {
        System.out.println("143. Reorder List");
        System.out.println("https://leetcode.com/problems/reorder-list/");
        this.lineBreak();
    }

    @Override
    public Object resolve(Object inputObject1, Object inputObject2) {

        int[] input = (int[])inputObject1;

        return reorderList(input);
    }

    public int[] reorderList (int[] input ) {
        return input;
    }

}
