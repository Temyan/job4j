package ru.job4j.array;

public class Square {

    public int[] calculate (int bound){

        int[] rst = new int[bound];

        for(int x = 0; x < bound; x++){

            rst[x] = (x + 1) * (x + 1);
        }

        return rst;
    }

}
