package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Counter calc = new Counter();
        calc.add(1D, 1D);
        int result = calc.getResult();
        int expected = 2D;
        assertThat(result, is(expected));
    }
}
