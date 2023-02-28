package by.teachmeskils.homeworks.hw_03032023.bank;

public class Main {
    public static void main(String[] args) {
        CardNumberValidate cardNumberValidate = new CardNumberValidate();
        cardNumberValidate.validateCardNumber("12345678914");

        CardViewValidate validateCardView = new CardViewValidate();
        validateCardView.cardViewValidate("Maestro");

        CardOwnerValidate validateCardOwner = new CardOwnerValidate();
        validateCardOwner.cardOwnerValidate("    ");

        CardCvvValidate validateCardCvv = new CardCvvValidate();
        validateCardCvv.cardCvvValidate("122");
    }
}
