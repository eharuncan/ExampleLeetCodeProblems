package org.example;

import org.example.Problem6.Problem6;
import org.example.Problem80.Problem80;
import org.example.Problem134.Problem134;
import org.example.Problem143.Problem143;
import org.example.Problem204.Problem204;
import org.example.Problem211.Problem211;

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
                "\nToplam geçen süre: " +
                        getDateDiff(startDate, endDate, TimeUnit.MILLISECONDS) +
                        " milisaniye");
    }

    public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
        long diffInMillies = date2.getTime() - date1.getTime();
        return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
    }

    public static void resolveProblem(){
//        Problem6 problem = new Problem6();
//        Problem80 problem = new Problem80();
//        Problem134 problem = new Problem134();
        Problem143 problem = new Problem143();
//        Problem204 problem = new Problem204();
//        Problem211 problem = new Problem211();
        problem.resolve();
    }
}






