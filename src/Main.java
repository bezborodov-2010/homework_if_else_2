public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задача 2");

        int clientDeviceYear = 2014;
        clientOS = 1;
        if (clientOS == 0 && clientDeviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear>=2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if (clientOS == 1 && clientDeviceYear>=2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задача 3");

        int year = 2024;
        if (year >= 1584 && year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("Задача 4");

        int deliveryDistance = 150;
        int timeDelivery = 1;
        if (deliveryDistance < 20 && deliveryDistance >= 0) {
            System.out.println("Потребуется дней: " + timeDelivery);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (timeDelivery)*2);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (timeDelivery)*3);
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println("Задача 5");

        int monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2 :
                System.out.println("Месяц принадлежит зиме");
                break;
            case 3, 4, 5:
                System.out.println("Месяц принадлежит весне");
                break;
            case 6, 7, 8:
                System.out.println("Месяц принадлежит лету");
                break;
            case 9, 10, 11:
                System.out.println("Месяц принадлежит осени");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}