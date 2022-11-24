package org.example;

import org.example.Problem143.Problem143;
import org.example.Problem204.Problem204;
import org.example.Problem6.Problem6;
import org.example.Problem80.Problem80;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        Problem6 problem = new Problem6();
//        problem.validate("PINALSIGYAHRPI", problem.resolve("PAYPALISHIRING", 4));

//        Problem80 problem = new Problem80();
//        ArrayList<Integer> expectedNums = new ArrayList<>();
//        expectedNums.add(1);
//        expectedNums.add(1);
//        expectedNums.add(2);
//        expectedNums.add(2);
//        expectedNums.add(3);
//        int[] input = {1, 1, 1, 2, 2, 3};
//        problem.validate(expectedNums, problem.resolve(input, null));

//        Problem143 problem = new Problem143();
//        int[] input = {1,2,3,4};
//        int[] expected = {1,4,2,3};
//        problem.validate(expected, problem.resolve(input, null));

        Problem204 problem = new Problem204();
        int n = 100000000;
        problem.validate(5761455, problem.resolve(n, null));
    }

}






