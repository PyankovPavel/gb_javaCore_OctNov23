package lesson5.homework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {

    /**
     * @param size кол-во оценок в табели успеваемости
     * @return получаем рандомную оценку от 2 до 5
     */
    public static List<Double> randomGrades(int size) {
        Integer[] grades = new Integer[size];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = (int) ((Math.random() + 0.5) * 4);
        }
        return Arrays.stream(grades).parallel().mapToDouble(n -> n).boxed().collect(Collectors.toList());
    }
}
