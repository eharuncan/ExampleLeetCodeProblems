package org.example.Problem134;

import org.example.IResolvable1Input;
import org.example.Problem;

public class Problem134 extends Problem implements IResolvable1Input {

    public Problem134() {
        System.out.println("134. Gas Station");
        System.out.println("https://leetcode.com/problems/gas-station/");
        lineBreak();
    }

    public void resolveAndShowResults(Object inputObject, Object expectedObject){
        validate(expectedObject, resolve(inputObject));
    }

    @Override
    public Object resolve(Object inputObject) {
        return null;
    }
}
