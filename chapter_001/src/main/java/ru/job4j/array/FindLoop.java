package ru.job4j.array;

public class FindLoop {

    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемнта нет в массиве, возвращаем это значение
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
