package ru.job4j.headfirstjava;

public class practiceTest {
    public static void main(String[] args) {
        Practice d = new Practice();
        d.snare = false;
        d.playTopHat();
        if (d.snare == true) {
            d.playSnare();
        }
    }
}
