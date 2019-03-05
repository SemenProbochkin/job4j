package ru.job4j.condition;

/**
 * Вычисление максимального числа из 3.
 *
 *@author Probochkin.Semen.
 */
public class MultiMax {
    /**
    * @param first pervoe chislo.
     * @param second vtoroe chislo.
     * @param third tretie chkislo.
     * @return Max chislo.
     * */
    public int max(int first, int second, int third) {
        int result1 = first > second ?  first :  second;
        return result1 > third ?  result1 :  third;
    }
}
