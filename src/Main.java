public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Задача 1.");
        int clientOs = 1;
        int android = 1;
        int iOS = 0;
        if (clientOs == iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
            if (clientOs == android) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }
        }
    }


    public static void task2() {
        System.out.println("Задача 2.");
        int clientOs = 1;
        int android = 1;
        int iOS = 0;
        int clientDeviceYear = 2014;
        int checkYear = 2015;
        if (clientOs == iOS && clientDeviceYear >= checkYear) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOs == iOS && clientDeviceYear < checkYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (clientOs == android && clientDeviceYear >= checkYear) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOs == android && clientDeviceYear < checkYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            //Проверенно всеми 4 вариантами
        }
    }

    public static void task3() {
        System.out.println("Задача 3.");
        int year = 2024;
        boolean thisIsLeapYear = ((year % 4 == 0) || (year % 100 != 0 && year % 400 == 0));
        if (thisIsLeapYear) {
            System.out.println(year + "год является високосным.");
        }else{
            System.out.println(year + "год не является високосным.");
        }
    }


    public static void task4() {
        System.out.println("Задача 4.");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays + ".");
         if (deliveryDistance >= 20 && deliveryDistance < 60) {
                System.out.println("Потребуется дней: " + (deliveryDays + 1) + ".");
            } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
             System.out.println("Потребуется дней: " + (deliveryDays + 2) + ".");
         }else{
                System.out.println("Доставки нет.");
            }
        }
    }

    public static void task5() {
        System.out.println("Задача 5.");
        int monthNumber = 7;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Ура-Лето!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень.");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }
    }
}

