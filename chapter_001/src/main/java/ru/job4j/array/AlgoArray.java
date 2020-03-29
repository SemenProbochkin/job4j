package ru.job4j.array;

/**
 *Class AlgoArray решение задачи 6.2 перевернуть массив.
 *@author probochkin
 *@since 29.03.2020
 */

public class AlgoArray {

    /**
     * main - переворот массива.
     * @param args  -  массив чисел.
     */

    public static void main(String[] args) {
        int[] array = new int[] {5, 4, 3, 2, 1};
        for (int i = 0; i < array.length / 2; i++) {
           int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
