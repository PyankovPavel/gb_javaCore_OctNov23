package lesson2.homework;

import java.util.Arrays;

public class Task3 {
    /*Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.*/

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 0, 4, 0};
        int[] array2 = {0, 0, 2, 3, 4};
        int[] array3 = {2, 1, 2, 0, 0};
        int[] array4 = ArrayUtils.randomArray();
        System.out.println(Arrays.toString(array) + " -> " + checkElements(array));
        System.out.println(Arrays.toString(array2) + " -> " + checkElements(array2));
        System.out.println(Arrays.toString(array3) + " -> " + checkElements(array3));
        System.out.println(Arrays.toString(array4) + " -> " + checkElements(array4));
    }

    public static boolean checkElements(int[] array) {
        boolean result = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 && array[i + 1] == 0) {
                result = true;
                break;
            }
        }
        return result;
    }
}
