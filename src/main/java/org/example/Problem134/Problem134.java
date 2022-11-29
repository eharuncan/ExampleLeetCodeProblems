package org.example.Problem134;

import org.example.IResolvable;
import org.example.Problem;

public class Problem134 extends Problem implements IResolvable {

    public Problem134() {
        System.out.println("134. Gas Station");
        System.out.println("https://leetcode.com/problems/gas-station/");
        lineBreak();
    }

    @Override
    public void resolve() {
        validate(3, canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[] {3, 4, 5, 1, 2}));
        validate(-1, canCompleteCircuit(new int[]{2, 3, 4}, new int[] {3, 4, 3}));
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currRemaining = 0;
        int totalRemaining = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i ++){
            int remaining = gas[i] - cost[i];
            if (currRemaining < 0){
                start = i;
                currRemaining = remaining;
            }
            else{
                currRemaining += remaining;
            }
            totalRemaining += remaining;
        }//for i
        if (totalRemaining < 0)
            return -1;
        else
            return start;
    }
}
