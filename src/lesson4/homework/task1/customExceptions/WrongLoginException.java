package lesson4.homework.task1.customExceptions;

public class WrongLoginException extends Exception{
    public WrongLoginException(String message) {
        super(message);
    }

}
