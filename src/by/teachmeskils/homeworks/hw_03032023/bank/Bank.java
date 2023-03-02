package by.teachmeskils.homeworks.hw_03032023.bank;

public class Bank {

    private String number;
    private String owner;
    private String cvv;
    private String view;

    public Bank(String number, String owner, String cvv, String view) {
        this.number = number;
        this.owner = owner;
        this.cvv = cvv;
        this.view = view;
    }

    public void validateCard() {

        class CardValidator {

            private String cardNumber;
            private String cardOwner;
            private String cardCvv;
            private String cardView;

            public CardValidator(String cardNumber, String cardOwner, String cardCvv, String cardView) {
                this.cardNumber = cardNumber;
                this.cardOwner = cardOwner;
                this.cardCvv = cardCvv;
                this.cardView = cardView;
            }

            public String getCardNumber() {
                return cardNumber;
            }

            public void setCardNumber(String cardNumber) {
                this.cardNumber = cardNumber;
            }

            public String getCardOwner() {
                return cardOwner;
            }

            public void setCardOwner(String cardOwner) {
                this.cardOwner = cardOwner;
            }

            public String getCardCvv() {
                return cardCvv;
            }

            public void setCardCvv(String cardCvv) {
                this.cardCvv = cardCvv;
            }

            public String getCardView() {
                return cardView;
            }

            public void setCardView(String cardView) {
                this.cardView = cardView;
            }

            private void validateCardNumber() {
                if (cardNumber.length() == 11) {
                    System.out.printf("Номер карты %s корректный\n", cardNumber);
                } else {
                    System.out.printf("Номер карты %s не корректный\n", cardNumber);
                }
            }

            public void validateCardOwner() {
                if (cardOwner.isBlank() == false) {
                    System.out.println("Данные о владельце коректны");
                } else {
                    System.out.println("Данные о владельце отсутствуют");
                }
            }

            private void validateCardCvv() {
                if (cardCvv.length() == 3 & cardCvv.isBlank() == false) {
                    System.out.printf("Данная карта имеет CVV код - %s\n", cardCvv);
                } else {
                    System.out.println("CVV код данной карты не коректен");
                }
            }

            private void validateCardView() {
                if (cardView.equalsIgnoreCase("visa") || cardView.equalsIgnoreCase("Maestro")) {
                    System.out.printf("Выданная карта %s\n", cardView);
                } else {
                    System.out.println("Данный вид карты не существует");
                }
            }
        }
        CardValidator cardValidator = new CardValidator(number, owner, cvv, view);
        cardValidator.validateCardNumber();
        cardValidator.validateCardOwner();
        cardValidator.validateCardCvv();
        cardValidator.validateCardView();

    }
}

