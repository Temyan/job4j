package ru.job4j.factorial;


public class Factorial {
    public int calc(int n) {
        int result = 1;
            for (int j = 1;  j <= n; j++) {
                result = result * j;
            }
            return result;
    }
}
