package Fibonacci;

import java.util.Map;

public class Fibonacci {
    private static final Map<Integer, Integer> dp = new java.util.HashMap<>();

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (dp.containsKey(n)) {
            return dp.get(n);
        }
        dp.put(n, fibonacci(n - 1) + fibonacci(n - 2));
        return dp.get(n);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci of " + n + " is " + fibonacci(n));
    }
}