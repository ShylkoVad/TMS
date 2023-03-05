package by.teachmeskils.homeworks.hw_03032023.bank;

public class Main {
    public static void main(String[] args) {
        Bank validateCard = new Bank("12345678910", "Ivanov", "254", "visa");
        validateCard.validateCard();
    }
}
