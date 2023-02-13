package by.teachmeskils.homeworks.hw_17022023;

public class Switch {
    public static void main(String[] args) {
        int n = 8;

        switch (n){
            case 1, 8:
                System.out.println("Сегодня понедельник");
                break;
            case 2, 9:
                System.out.println("Сегодня вторник");
                break;
            case 3:
                System.out.println("Сегодня среда");
                break;
            case 4:
                System.out.println("Сегодня четверг");
                break;
            case 5:
                System.out.println("Сегодня пятница");
                break;
            case 6:
                System.out.println("Сегодня суббота");
                break;
            case 7:
                System.out.println("Сегодня воскресенье");
                break;
            default:
                System.out.println("Не корректно введено число недели");
        }
    }
}
