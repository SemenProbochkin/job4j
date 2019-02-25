package ru.job4j.condition;


import org.junit.Test;

import ru.job4j.condition.Point;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Semen Probochkin (semion.probochkins@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class PointTest {
    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        double result = a.distanceTo(b);


        assertThat(result, closeTo(4.4, 0.1));
    }
}
