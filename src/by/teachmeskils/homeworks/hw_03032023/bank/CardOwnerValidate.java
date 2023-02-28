package by.teachmeskils.homeworks.hw_03032023.bank;

public class CardOwnerValidate {
    public void cardOwnerValidate(String owner) {
        class CardOwner {
            private String cardOwner;

            public CardOwner(String cardOwner) {
                this.cardOwner = cardOwner;
            }

            public String getCardOwner() {
                return cardOwner;
            }

            public void setCardOwner(String cardOwner) {
                this.cardOwner = cardOwner;
            }

            public void validateCardOwner() {
                if (cardOwner.isBlank() == false) {
                    System.out.println("Данные о владельце коректны");
                } else {
                    System.out.println("Данные о владельце отсутствуют");
                }
            }
        }
        CardOwner cardOwner = new CardOwner(owner);
        cardOwner.validateCardOwner();
    }
}
