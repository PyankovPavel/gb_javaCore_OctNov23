package lesson4.homework.task2.customExceptions;

public class WrongItemException extends Exception {
    public WrongItemException(String message) {
        super(message);
    }
}
