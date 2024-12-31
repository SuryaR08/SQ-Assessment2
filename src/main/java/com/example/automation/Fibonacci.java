package com.example.automation;

public class Fibonacci {
    public int[] generateSeries(int n) {
        if (n <= 0) {
            return new int[0];
        }
        if (n <= 0) {
            return new int[0];
        }
        int[] series = new int[n];
        series[0] = 0;
        if (n > 1) {
            series[1] = 1;
            for (int i = 2; i < n; i++) {
                series[i] = series[i - 1] + series[i - 2];
            }
        }
        if (n > 1) {
            series[1] = 1;
            for (int i = 2; i < n; i++) {
                series[i] = series[i - 1] + series[i - 2];
            }
        }
        return series;
    }

    public int getNthFibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 0;
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return getNthFibonacci(n - 1) + getNthFibonacci(n - 2);
    }

    public int calculate(int n) {
        if (n <= 1) return n;
        return calculate(n - 1) + calculate(n - 2);
    }

    public int calculateDuplicate1(int n) { // Intentional duplicate
        if (n <= 1) return n;
        return calculateDuplicate1(n - 1) + calculateDuplicate1(n - 2);
    }

    public int calculateDuplicate2(int n) { // Intentional duplicate
        if (n <= 1) return n;
        return calculateDuplicate2(n - 1) + calculateDuplicate2(n - 2);
    }
}
