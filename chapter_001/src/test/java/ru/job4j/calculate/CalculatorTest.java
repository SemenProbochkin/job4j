package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Semen Probochkin (semion.probochkins@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        calc.add(2, 2);
        double result = calc.getResult();
        double expected = 4;
        assertThat(result, is(expected));
    }
    @Test
    public void whenSubtractOneMinusOneThenTwo()  {
        Calculator calc = new Calculator();
        calc.subtract(2, 2);
        double result = calc.getResult();
        double expected = 0;
        assertThat(result, is(expected));
    }
    @Test
    public void whenDivOneDivideOneThenTwo()  {
        Calculator calc = new Calculator();
        calc.div(2, 2);
        double result = calc.getResult();
        double expected = 1;
        assertThat(result, is(expected));
    }
    @Test
    public void whenMultipleOneMultiplyOneThenTwo()  {
        Calculator calc = new Calculator();
        calc.multiple(2, 2);
        double result = calc.getResult();
        double expected = 4;
        assertThat(result, is(expected));
    }
}
