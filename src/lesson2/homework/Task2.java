package lesson2.homework;

import java.util.Arrays;

public class Task2 {
    /*Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами
    переданного не пустого массива.*/
    public static void main(String[] args) {
        int[] arr = ArrayUtils.randomArray();
        System.out.println(Arrays.toString(arr) + " diff between max & min -> " + elementsDiff(arr));
    }

    public static int elementsDiff(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max - min;
    }
}
