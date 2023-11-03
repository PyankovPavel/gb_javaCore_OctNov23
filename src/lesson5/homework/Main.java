package lesson5.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static lesson5.homework.Utils.randomGrades;

public class Main {

    /* Имеется список студентов. Каждый студент имеет имя, список оценок и специальность.
Найдите первых 5 студентов специальности "Информатика" с средним баллом выше 4.5, отсортированных по убыванию среднего балла.
В решении не использовать циклы! Только StreamAPI*/

    public static void main(String[] args) {
        int numberOfGrades = (int) (Math.random() * 7 + 5); // рандомное кол-во оценок в табели успеваемости
        List<Student> students = new ArrayList<>();
        students.add(new Student("Pavel", randomGrades(numberOfGrades), "IT"));
        students.add(new Student("Egor", randomGrades(numberOfGrades), "IT"));
        students.add(new Student("Oleg", randomGrades(numberOfGrades), "IT"));
        students.add(new Student("Igor", randomGrades(numberOfGrades), "History"));
        students.add(new Student("Anna", randomGrades(numberOfGrades), "Languages"));
        students.add(new Student("Anastasiya", randomGrades(numberOfGrades), "IT"));
        students.add(new Student("Viktor", randomGrades(numberOfGrades), "Economics"));
        students.add(new Student("Ksu", randomGrades(numberOfGrades), "Economics"));
        students.add(new Student("Ivan", randomGrades(numberOfGrades), "IT"));
        students.add(new Student("Artem", randomGrades(numberOfGrades), "History"));

        System.out.println(students.toString().replace(']', ' '));

        List<Student> filteredStudents = students.stream()
                .sorted(Comparator.comparing(Student::getName)) // сортируем по имени, если оценки совпали
                .sorted(Comparator.comparing(Student::getAverageGrade).reversed()) // сортируем по ср. оценке по убыванию
                .filter(student -> student.getSpecialty().equals("IT")) // фильтр по Информатике
                .filter(student -> student.getAverageGrade() > 3.3) // фильтр по ср. оценке
                .toList();

        System.out.println("Sorted students are: \n" + filteredStudents.toString().replace(']', ' '));


    }


}
