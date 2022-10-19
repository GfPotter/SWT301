package com.example;

/**
 * Hello world!
 *
 */
public class App {

    public static int loop(int n, int m) {
        int a = 0;
        int b = 0;
        for (int i = 1; i <= n; i++) {
            a += i;
        }
        for (int j = 1; j <= m; j++) {
            b += j;
        }
        return a + b;
    }

}
