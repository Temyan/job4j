package ru.job4j.converter;
public class Converter  {
    /**
     * Конвентируем рубли в евро.
     * @param value рубли.
     * @return евро.
     *
     */
    public int rubleToEuro(int value) {
        return value / 70;
    }
    /**
     * Конвентируем рубли в доллары.
     * @param value рубли
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return value / 60;
    }
}