package lesson2.homework;

import java.util.Arrays;

public class Task1 {
    /*Написать метод, возвращающий количество чётных элементов массива.
    countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0*/

    public static void main(String[] args) {
        int[] array = ArrayUtils.randomArray();
        System.out.println(Arrays.toString(array) + " -> " + countEvens(array));
    }

    public static int countEvens(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }



}
