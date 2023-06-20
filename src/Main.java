public class Main {

    public static void main(String[] args) {

        int score = 150;
        int deposit1 = 500;
        int deposit2 = 1321;

        int refill1;
        int bonus1;
        bonus1 = (deposit1 / 100);
        if (deposit1 > 1000) {
            refill1 = (score + deposit1);
            System.out.println("Счет пополнен на " + deposit1);
            System.out.println("Средств на счете " + refill1);
            System.out.println("Бонусов начислено: " + bonus1);

        } else {
            refill1 = (score + deposit1);
            System.out.println("Счет пополнен на " + deposit1);
            System.out.println("Бонусов начислено: 0");
            System.out.println("Средств на счете " + refill1);

        }
        System.out.println();
        int refill2;
        int bonus2;
        if (deposit2 > 1000) {
            refill2 = (score + deposit2);
            bonus2 = (deposit2 / 100);
            System.out.println("Счет пополнен на " + deposit2);
            System.out.println("Бонусов начислено " + bonus2);
            System.out.println("Средств на счете " + (refill2 + bonus2));

        } else {
            refill2 = (score + deposit2);
            System.out.println("Счет пополнен на" + deposit2);
            System.out.println("Средств на счете " + refill2);
            System.out.println("Бонусов начислено: ");
        }

    }
}
