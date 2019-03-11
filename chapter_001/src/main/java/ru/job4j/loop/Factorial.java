package ru.job4j.loop;
/**
 * Factorial.
 *
 * @author Probochkin Semion.
 * @version $Id$.
 * @since 0.1
 */
public class Factorial {
    /**
     * calc - вычисление факториала.
     * @param n - число.
     * @return result - факториал.
     */
    public int calc(int n) {
        int result = 1;
        if (n == 0) {
            return result;
        } else {

            for (int index = 1; index <= n; index++) {

                    result = result *  index;

            }
            return result;
        }
    }
}