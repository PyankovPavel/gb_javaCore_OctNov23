package lesson4.homework.task2.customExceptions;

public class WrongCustomerException extends Exception {
    public WrongCustomerException(String message) {
        super(message);
    }
}
