package ru.job4j.loop;

public class Counter {
    public int add(int start, int finish) {
        start = 1;
        finish = 10;
        while(start <= finish) {
            int result = start % 2;
            if(result == 0) {
                return result += result;
            }
        }
        return start;
    }
}
