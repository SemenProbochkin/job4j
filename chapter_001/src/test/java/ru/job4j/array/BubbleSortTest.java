package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {

        int[] result = BubbleSort.sort(new int[] {1, 5, 4, 2, 3, 1, 7, 8, 0, 5});
        int[] expect = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(result, is(expect));

    }
}