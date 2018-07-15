package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
*Test
*
*@author Artem M (mailto:maartel@inbox.ru)
*@version $id$
*@since 0.1
*/
public class CalculateTest {
    /**
    *Test echo.
    */ @Test
    public void whenTakeNameThenTreeEchoPlusName() {
    String input = "Artem Maiorov";
    String expect = "Echo, echo, echo : Artem Maiorov"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
  }
    
}