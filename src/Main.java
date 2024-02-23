public class Main {
    public static void main(String[] args) {

// Задача 1
        byte clientOS = -1;
        switch (clientOS)  {
            case 0: // iOS
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1: // Android
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default: // Symbian, Windows mobile и прочие
                System.out.println("К сожалению, экзотические ОС не временно не поддерживаются");
        }

        // Задача 2
        int clientDeviceYear = 2015;
        switch (clientOS)  {
            case 0: // iOS
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1: // Android
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default: // Symbian, Windows mobile и прочие
                System.out.println("К сожалению, экзотические ОС не временно не поддерживаются");
        }

        // Задача 3
        int year = 1400;
        if (year < 1584) {
            System.out.println("Простите, господин, наши ученые еще не придумали високосный год");
        } else if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + "год является високосным");
        } else System.out.println(year + "год не является високосным");

        // Задача 4
        int deliveryDistance = 1;
        byte daysToDeliver ;
        if (deliveryDistance <= 20) {
            daysToDeliver = 1;
            System.out.println("Потребуется дней: " + daysToDeliver);
        } else if (deliveryDistance> 20 && deliveryDistance <= 60) {
            daysToDeliver = 2;
            System.out.println("Потребуется дней: " + daysToDeliver);
        } else if (deliveryDistance> 60 && deliveryDistance <= 100) {
            daysToDeliver = 3;
            System.out.println("Потребуется дней: " + daysToDeliver);
        } else System.out.println("Так далеко не возим");

        // Задача 5
        byte monthNumber = 13;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Зима");
            case 3, 4, 5:
                System.out.println("Весна");
            case 6, 7, 8:
                System.out.println("Лето");
            case 9, 10, 11:
                System.out.println("Осень");
            default:
                System.out.println("Месяц задан неверно");
        }
    }
}