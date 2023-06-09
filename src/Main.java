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
        if (clientOs == 0)
            System.out.println("Установите версию приложения для iOS по ссылке.");
        else if (clientOs == 1)
            System.out.println("Установите версию приложения для Android по ссылке.");
    }

    public static void task2() {
        System.out.println("Задача 2.");
        int clientOs = 1;
        int clientDeviceYear = 2015;
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }
        if (clientOs == 1 && clientDeviceYear >= 2015)
            System.out.println("Установите версию приложения для Android по ссылке.");
        else if (clientOs == 1 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        //Проверенно всеми 4 вариантами
    }

    public static void task3() {
        System.out.println("Задача 3.");
        int year = 2024;
        boolean thisIsLeapYear = ((year % 4 == 0) || (year % 100 != 0 && year % 400 == 0));
        if (thisIsLeapYear)
            System.out.println(year + "год является високосным.");
        else
            System.out.println(year + "год не является високосным.");

    }


    public static void task4() {
        System.out.println("Задача 4.");
        int deliveryDistance = 95;
        if (deliveryDistance < 20)
            System.out.println("Потребуется дней: " + 1 + ".");
        else if (deliveryDistance >= 20 && deliveryDistance < 60)
            System.out.println("Потребуется дней: " + 2 + ".");
        else if (deliveryDistance >= 60 && deliveryDistance <= 100)
            System.out.println("Потребуется дней: " + 3 + ".");
        else
            System.out.println("Доставки нет.");
    }

    public static void task5() {
        System.out.println("Задача 5.");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь - зима.");
                break;
            case 2:
                System.out.println("Февраль - зима.");
                break;
            case 3:
                System.out.println("Март - весна.");
                break;
            case 4:
                System.out.println("Апрель - весна.");
                break;
            case 5:
                System.out.println("Май - весна.");
                break;
            case 6:
                System.out.println("Июнь - лето.");
                break;
            case 7:
                System.out.println("Июль - лето.");
                break;
            case 8:
                System.out.println("Август - лето.");
                break;
            case 9:
                System.out.println("Сентябрь - осень.");
                break;
            case 10:
                System.out.println("Октябрь - осень.");
                break;
            case 11:
                System.out.println("Ноябрь - осень.");
                break;
            case 12:
                System.out.println("Декабрь - зима");
            break;
            default:
                System.out.println("Такого месяца не существует.");
        }
    }
}

