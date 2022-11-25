package org.example.Problem143;

import org.example.IResolvable1Input;
import org.example.Problem;

public class Problem143 extends Problem implements IResolvable1Input {

    public Problem143() {
        System.out.println("143. Reorder List");
        System.out.println("https://leetcode.com/problems/reorder-list/");
        lineBreak();
    }

    public void resolveAndShowResults(Object inputObject, Object expectedObject){
        validate(expectedObject, resolve(inputObject));
    }

    @Override
    public Object resolve(Object inputObject) {
        int[] input = (int[])inputObject;
        return reorderList(input);
    }

    public int[] reorderList (int[] input ) {
        return input;
    }

}
