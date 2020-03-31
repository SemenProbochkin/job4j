package ru.job4j.array;
/**
 *Class BubbleSort решение задачи 6.5 сортировка алгоритмом пузырька.
 *@author probochkin
 *@since 30.03.2019
 */
public class BubbleSort {
    /**
     * sort - сортирует массив чисел.
     * @param array массив чисел.
     * @return array отсортированный масив
     */
    public static int[] sort(int[] array){
        for ( int index = 0; index < array.length; index++) {
            for ( int i = index +1 ; i < array.length; i++){
                if (array[index] > array[i]) {
                    int number = array[index];
                    array[index] = array[i];
                    array[i] = number;
                }
            }
        }
        return array;
    }
}
