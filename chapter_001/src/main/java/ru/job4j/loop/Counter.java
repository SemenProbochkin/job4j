package ru.job4j.loop;

/**
 * Counter.
 *
 * @author Probochkin Semion.
 * @version $Id$.
 * @since 0.1
 */

public class Counter {
    /**
     * Add - суммирование четных чисел в диапозоне.
     * @param start - первый аргумент.
     * @param finish - второй аргумент.
     * @return sum - сумма чисел.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            if (index % 2 == 0) {
                sum = sum + index;
            }
        }
        return sum;
    }
}
