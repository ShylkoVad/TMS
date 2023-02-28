package by.teachmeskils.homeworks.hw_03032023.bank;

public class CardCvvValidate {
    public void cardCvvValidate(String cvv) {
        class CardCvv {
            private String cardCvv;

            public CardCvv(String cardCvv) {
                this.cardCvv = cardCvv;
            }

            public String getCardCvv() {
                return cardCvv;
            }

            public void setCardCvv(String cardCvv) {
                this.cardCvv = cardCvv;
            }

            private void validateCardCvv() {

                if (cardCvv.length() == 3 || !cardCvv.isBlank()) {
                    System.out.printf("Данная карта имеет CVV код - %s", cardCvv);
                } else {
                    System.out.println("CVV код данной карты не коректен");
                }
            }
        }
        CardCvv cardCvv = new CardCvv(cvv);
        cardCvv.validateCardCvv();
    }
}
