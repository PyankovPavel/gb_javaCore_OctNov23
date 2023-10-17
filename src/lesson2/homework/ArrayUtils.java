package lesson2.homework;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtils {
    public static int[] randomArray() {
        int size = 0;
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Input size of the array: ");
                Scanner sc = new Scanner(System.in);
                size = sc.nextInt();
                flag = false;
            } catch (Exception e) {
                System.out.println("Wrong input, try again using numbers only");
            }
        }
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100) - new Random().nextInt(50);
        }
        return array;
    }
}
