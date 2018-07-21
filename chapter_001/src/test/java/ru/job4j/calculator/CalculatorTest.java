package ru.job4j.calculator;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOneThenTwo() {
        Calculator c;
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void name() {
    Calculator calc = new Calculator();
    calc.div(6, 3);
    double result = calc.getResult();
    assertThat(result, is(18D));
    }

    @Test
    public void name () {
        Calculator calc = new Calculator();
        calc.div(12, 2);
        int result = calc.getResult();
        assertThat(result, is(value 18D));
    }

    @Test
    public void name() {
        Calculator calc = new Calculator();
        calc.div(2, 2);
        int result = calc.getResult();
        assertThat(result, is(value 18D));
    }
}
