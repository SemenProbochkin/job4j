package ru.job4j.array;
/**
 *Class Matrix Двухмерный массив. Таблица умножения.
 *@author probochkin
 *@since 31.03.2020
 */
public class Matrix {
    /**
     * multiple - создает матрицу.
     * @param size размер матрицы.
     * @return table матрица
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
               table[i][j] = (1 + j + i) + (i * j);

            }
        }
        return table;

    }
}