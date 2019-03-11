package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * CounterTest.
 *
 * @author Probochkin Semion.
 * @version $Id$.
 * @since 0.1
 */
public class CounterTest {

    /**
     * Test add.
     */
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter check = new Counter();
        int result = check.add(1,10);
        assertThat(result, is(30));
    }
}