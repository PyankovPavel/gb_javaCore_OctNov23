package lesson3.homework;

/*2. Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты в
класс руководителя, модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей.
В основной программе создайте руководителя и поместите его в общий массив сотрудников. Повысьте зарплату всем
сотрудникам и проследите, чтобы зарплата руководителя не повысилась.*/

public class Director extends Employee {

    public Director(String firstName, String middleName, String lastName, String position, long phone, int salary, int age) {
        super(firstName, middleName, lastName, position, phone, salary, age);
    }

    /**
     * Реализация через instance of
     */
    public static Employee[] riseSalary(Employee[] staff, int amount) {
        for (int i = 0; i < staff.length; i++) {
            if (!(staff[i] instanceof Director)) {
                staff[i].setSalary(staff[i].getSalary() + amount);
            }
        }
        return staff;
    }

/**
 * Реализация через поиск по наименованию должности */

//    public static Employee[] riseSalary(Employee[] staff, int amount) {
//        for (int i = 0; i < staff.length; i++) {
//            if (!staff[i].getPosition().equals("director")) {
//                staff[i].setSalary(staff[i].getSalary() + amount);
//            }
//        }
//        return staff;
//    }


}
