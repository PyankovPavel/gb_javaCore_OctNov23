package lesson5.homework;

import java.util.List;

public class Student {
    private String name;
    private List<Double> grades;
    private String specialty;

    public Student(String name, List<Double> grades, String specialty) {
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public double getAverageGrade() {
        return this.grades.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                ", specialty='" + specialty + '\'' +
                ", AVG grade is " + String.format("%.2f", getAverageGrade()) +
                "}\n";
    }
}
