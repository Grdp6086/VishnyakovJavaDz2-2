public class Main {
    public static void main(String[] args) {
        int replenishment = 100;
        int oldBalance = 1000;
        int balance = replenishment + oldBalance;

        System.out.println("Баланс счета клиента " + balance);

        if (balance >= 1000) {
            int bonus = balance / 100;
            int bonusBalance = bonus + balance;
            System.out.println("Количество бонусов зачисленых на счет " + bonus);
            System.out.println("Баланс с учетом бонуса " + bonusBalance);
        } else {
            int addOnAcc = 1000 - balance;
            System.out.println("Пополните счет на " + addOnAcc + ", чтобы получить бонусы");
        }

    }
}