package com.example.automation;

public class Fibonacci {
    public int[] generateSeries(int n) {
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
        return series;
    }

    public int getNthFibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return getNthFibonacci(n - 1) + getNthFibonacci(n - 2);
    }

    public int[] generateSeriesDuplicated1(int n) {
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
        return series;
    }
    public int duplicateFibonacci1(int n) {
        if (n <= 1) return n;
        return duplicateFibonacci1(n - 1) + duplicateFibonacci1(n - 2);
    }
    
    public int duplicateFibonacci2(int n) {
        if (n <= 1) return n;
        return duplicateFibonacci2(n - 1) + duplicateFibonacci2(n - 2);
    }
}
