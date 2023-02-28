package by.teachmeskils.homeworks.hw_03032023.bank;

public class CardViewValidate {
    public void cardViewValidate(String view) {
        class CardView {
            private String cardView;

            public CardView(String cardView) {
                this.cardView = cardView;
            }

            public String getCardView() {
                return cardView;
            }

            public void setCardView(String cardView) {
                this.cardView = cardView;
            }

            private void validateCardView() {
                if (cardView.equalsIgnoreCase("visa") || cardView.equalsIgnoreCase("Maestro")) {
                    System.out.printf("Выданная карта %s\n", cardView);
                } else {
                    System.out.println("Данной вид карты не существует\n");
                }
            }
        }
        CardView cardView = new CardView(view);
        cardView.validateCardView();
    }
}