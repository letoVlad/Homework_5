public class Main {
    public static void main(String[] args) {
        //Задание 1
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("--------------------------");
        //Задание 2
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("--------------------------");
        //Задание 3
        for (int i = 0; i < 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("--------------------------");
        //Задание 3
        for (int i = 10; i > -10; i--) {
            System.out.println(i);
        }

        System.out.println("--------------------------");
        //Задание 5
        for (int year = 1904; year < 2096; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            }
        }

        System.out.println("--------------------------");
        //Задание 6
        for (int i = 0; i <= 98; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("--------------------------");
        //Задание 7
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        System.out.println("--------------------------");
        //Задание 8
        int deposit = 0;
        int contribution = 29_000;

        for (int i = 1; i <= 12; i++) {
            System.out.println("Месяц " + i + " Сумма накоплений равна " + (deposit = deposit + contribution) + " рублей");
        }

        System.out.println("--------------------------");
        //Задание 8
        int deposit1 = 0;
        int contribution1 = 29_000;
        for (int i = 1; i <= 12; i++) {
            System.out.println("Месяц " + i + " Сумма накоплений равна " + (((deposit1 = deposit1 + contribution1) * 12) / 100 + deposit1) + " рублей");
        }

    }
}
