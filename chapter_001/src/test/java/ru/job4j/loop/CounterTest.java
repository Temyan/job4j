package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
   @Test
   public void whenTakeNameThenTreeEchoPlusName() {
       Counter calc = new Counter();
       int result = calc.add(1, 10);
       assertThat(result, is(30));
   }
}
