package paymentsystem.exceptions;

public class MerchantNotFoundException extends Exception {
    public MerchantNotFoundException(String message) {
        super(message);
    }
}