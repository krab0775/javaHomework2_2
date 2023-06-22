public class Main {

    public static void main(String[] args) {

        int score = 150; // Средства на счете
        int deposit = 2187; //

        int refill;
        int bonus;
        bonus = (deposit / 100);
        if (deposit > 1000) {
            refill = (score + deposit);
            System.out.println("Счет пополнен на " + deposit);
            System.out.println("Средств на счете " + refill);
            System.out.println("Бонусов начислено: " + bonus);

        } else {
            refill = (score + deposit);
            System.out.println("Счет пополнен на " + deposit);
            System.out.println("Бонусов начислено: 0");
            System.out.println("Средств на счете " + refill);
        }
    }
}
