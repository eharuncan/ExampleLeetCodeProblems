package org.example;

import org.example.Problem143.Problem143;
import org.example.Problem204.Problem204;
import org.example.Problem6.Problem6;
import org.example.Problem80.Problem80;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        showResults();
    }

    public static void showResults(){
        Date startDate = new Date();
        resolveProblem();
        Date endDate = new Date();
        System.out.println(
                "Toplam geçen süre: " +
                        getDateDiff(startDate, endDate, TimeUnit.MILLISECONDS) +
                        " milisaniye");
    }

    public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
        long diffInMillies = date2.getTime() - date1.getTime();
        return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
    }

    public static void resolveProblem(){
//        Problem6 problem = new Problem6();
//        problem.resolveAndShowResults("PAYPALISHIRING", 4, "PINALSIGYAHRPI");

//        Problem80 problem = new Problem80();
//        problem.resolveAndShowResults(new int[]{1, 1, 1, 2, 2, 3}, new int[]{1, 1, 2, 2, 3});

//        Problem143 problem = new Problem143();
//        problem.resolveAndShowResults(new int[]{1, 2, 3, 4}, new int[]{1, 4, 2, 3});

        Problem204 problem = new Problem204();
        problem.resolveAndShowResults(100000000, 5761455);
    }

}






