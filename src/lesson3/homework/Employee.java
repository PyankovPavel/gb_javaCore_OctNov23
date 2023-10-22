package lesson3.homework;

import java.util.Arrays;

public class Employee {
    public static void main(String[] args) {
        Employee[] staff = {
                new Employee("Pavel", "Sergeevich", "Piankov", "student",
                        88005556565L, 12000, 35),
                new Employee("Anastasiya", "Vladidimirovna", "Shpak", "coach",
                        88005557799L, 40000, 45),
                new Employee("Vladimir", "Olegovich", "Pak", "hr",
                        88005555555L, 35000, 30),
                new Employee("Pavel", "Andreevich", "Utkin", "driver",
                        88005551234L, 70000, 55),
                new Employee("Olga", "Viktorovna", "Ivanova", "student",
                        88005556321L, 12000, 25),
                new Director("Oleg", "Igorevich", "Boss", "director",
                        88005551000L, 150_000, 50)};
        Director.riseSalary(staff, 5000);
        System.out.println(Arrays.toString(staff).replace(',', ' '));
    }

    private String firstName;
    private String middleName;
    private String lastName;
    private String position;
    private long phone;
    private int salary;
    private int age;

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public Employee(String firstName, String middleName, String lastName, String position, long phone, int salary, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", phone=" + phone +
                ", salary=" + salary +
                ", age=" + age +
                "}\n";
    }


}
