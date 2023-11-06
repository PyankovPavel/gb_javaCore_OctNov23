package lesson4.homework.task1;

import lesson4.homework.task1.customExceptions.WrongLoginException;
import lesson4.homework.task1.customExceptions.WrongPasswordException;

public class Main {
    /*1. Задача: Проверка логина и пароля
1 - Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
2 - Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям, необходимо
выбросить WrongLoginException.
3 -Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны.
Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
4 - WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами –
один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
5 - В основном классе программы необходимо по-разному обработать исключения.
6 - Метод возвращает true, если значения верны или false в другом случае.*/
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        System.out.println(isCorrect("SomeLogin",
                "1234500000000000000", "123456"));

    }

    static boolean isCorrect(String login, String password, String confirmPassword) throws
            WrongLoginException, WrongPasswordException {
        boolean status = true;
        if (login.length() > 20) {
            throw new WrongLoginException("Login length is incorrect");
        }
        try {
            if (password.length() > 20) {
                throw new WrongPasswordException("Password length is incorrect");
            }
        } catch (WrongPasswordException e) {
            e.printStackTrace();
            status = false;
        }
        if (password.length() != confirmPassword.length()) {
            throw new WrongPasswordException("Passwords are different");
        }
        return status;
    }
}
