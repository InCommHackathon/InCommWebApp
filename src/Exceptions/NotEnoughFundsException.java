package Exceptions;

public class NotEnoughFundsException extends Throwable {

    public NotEnoughFundsException() {
        super("You do not have enough funds for this purchase");
    }
}
