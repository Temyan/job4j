package ru.job4j.calculator;

public class Calculator {
    /**
     * переменная сохранющая результат работы методов
     */
    private double result;


    public Calculator() {
    }

    /**
     * Метод для сложения двух чисел
     * @param first первое число
     * @param second второе числоf
     */
    public void  add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Метод для получения значения резулятат работы методов не нарушающий инкапсуляцию
     * @return результат
     */
    public double getResult() {
        return this.result;
    }

    /**
     *Метод для деления двух чисел
     * @param first
     * @param second
     */
    public void div(int first, int second) {
     this.result =  first / second;
    }

    public int getResult() {
        return this.result;
    }

    /**
     *Метод для вычитания двух чисел
     * @param first
     * @param second
     */
    public void subtract(int first, int second) {
        this.result = first - second;
    }

    public int getResult() {
        return this.result;
    }

    /**
     *Метод для умножения двух чисел
     * @param first
     * @param second
     */
    public void multiple(int first, int second) {
        this.result = first * second;
    }
    public int getResult() {
        return this.result;
    }
}