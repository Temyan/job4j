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
     * Конвентируем евро в рубли.
     * @param value рубли.
     * @return евро.
     *
     */
    public int euroToRuble(int value) {
        return value * 70;
    }

    /**
     * Конвентируем рубли в доллары.
     * @param value рубли
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return value / 60;
    }

    /**
     * Конвентируем доллары в рубли.
     * @param value рубли
     * @return Доллары
     */
    public int dollarToRuble(int value) {
        return value * 60;
    }
}