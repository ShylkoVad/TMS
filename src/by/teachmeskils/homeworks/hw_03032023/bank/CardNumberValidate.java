package by.teachmeskils.homeworks.hw_03032023.bank;

public class CardNumberValidate {
    public void validateCardNumber(String number) {
        class CardNumber {
            private String cardNumber;

            public CardNumber(String cardNumber) {
                this.cardNumber = cardNumber;
            }

            public String getCardNumber() {
                return cardNumber;
            }

            public void setCardNumber(String cardNumber) {
                this.cardNumber = cardNumber;
            }

            private void validateCardNumber() {
                if (cardNumber.length() == 11) {
                    System.out.printf("Номер карты %s корректный\n", cardNumber);
                } else {
                    System.out.printf("Номер карты %s не корректный\n", cardNumber);
                }
            }
        }
        CardNumber cardNumber = new CardNumber(number);
        cardNumber.validateCardNumber();
    }
}
