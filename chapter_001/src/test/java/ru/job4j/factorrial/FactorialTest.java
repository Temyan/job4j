package ru.job4j.factorrial;


import ru.job4j.factorial.Factorial;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenTakeNameThenTreeEchoPlusName() {

        Factorial factor = new Factorial();
        int result = factor.calc(5);
        assertThat(result, is(120));
    }
}
