package ru.job4j.calculator;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOneThenTwo() {
        Calculator c;
        Calculator calc = new Calculator();
        calc.add(5, 5);
        double result = calc.getResult();
        double expected = 10;
        assertThat(result, is(10.0));
    }

    @Test
    public void whenDivOneThenTwo() {
    Calculator calc = new Calculator();
    calc.div(6, 3);
    double result = calc.getResult();
    assertThat(result, is(2.0));
    }

    @Test
    public void whenSubOneThenTwo() {
        Calculator calc = new Calculator();
        calc.subtract(12, 2);
        double result = calc.getResult();
        assertThat(result, is(10.0));
    }
//т.е что
    @Test
    public void whenMultOneThenTwo() {
        Calculator calc = new Calculator();
        calc.multiple(2, 2);
        double result = calc.getResult();
        assertThat(result, is(4.0));
    }
}
