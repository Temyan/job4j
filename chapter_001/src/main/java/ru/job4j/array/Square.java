package ru.job4j.array;

public class Square {

    public int[] calculate (int bound) {

        int[] rst = new int[bound];

        for(int x = 0; x < bound; x++) {

            int j = 1;
            j = j * j;

            rst[x]  =  j;
        }

        return rst;
    }

}
