package ru.job4j.loop;

public class Counter {

    public int add(int start, int finish) {
        int result = 0;
            for (int index = start; index <= finish; index++) {

                if (index % 2 == 0) {
                    result += index;
            }
        }
        return result;
    }
}
