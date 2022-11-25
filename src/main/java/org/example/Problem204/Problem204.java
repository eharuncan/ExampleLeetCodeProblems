package org.example.Problem204;

import org.example.IResolvable;
import org.example.Problem;

public class Problem204 extends Problem implements IResolvable {

    public Problem204() {
        System.out.println("204. Count Primes");
        System.out.println("https://leetcode.com/problems/count-primes/");
        lineBreak();
    }

    public void resolveAndShowResults(Object inputObject, Object expectedObject){
        validate(expectedObject, resolve(inputObject));
    }

    @Override
    public Object resolve(Object inputObject, Object expectedObject) {
        return null;
    }

    @Override
    public Object resolve(Object inputObject) {
        int n = (int)inputObject;
        return countPrimes(n);
    }

    public int countPrimes(int n) {
        int j = 0;
        // Create a boolean array "prime[0..n]" and
        // initialize all entries it as true. A value in
        // prime[i] will finally be false if i is Not a
        // prime, else true.
        boolean prime[] = new boolean[n];
        for (int i = 0; i < n; i++)
            prime[i] = true;

        for (int p = 2; p * p < n; p++) {
            // If prime[p] is not changed, then it is a
            // prime
            if (prime[p] == true) {
                // Update all multiples of p greater than or
                // equal to the square of it numbers which
                // are multiple of p and are less than p^2
                // are already been marked.
                for (int i = p * p; i < n; i += p)
                    prime[i] = false;
            }
        }

        // Calculate all prime numbers
        for (int i = 2; i < n; i++) {
            if (prime[i] == true)
                j++;
        }
        return j;
    }
}
