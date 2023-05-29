public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }
    public static void task1(){
        System.out.println("Задача 1.");
        int clientOs=1;
        if (clientOs==0)
            System.out.println("Установите версию приложения для iOS по ссылке.");
        else if (clientOs==1)
            System.out.println("Установите версию приложения для Android по ссылке.");
    }
    public static void task2(){
        System.out.println("Задача 2.");
       int clientOs=1;
       int clientDeviceYear=2015;
       if (clientOs==0&&clientDeviceYear>=2015) {
           System.out.println("Установите версию приложения для iOS по ссылке.");
       }else if (clientOs == 0 && clientDeviceYear < 2015){
               System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
           }
       if (clientOs==1&&clientDeviceYear>=2015)
           System.out.println("Установите версию приложения для Android по ссылке.");
           else if (clientOs==1&&clientDeviceYear<2015)
           System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        //Проверенно всеми 4 вариантами
    }
    public static void task3(){
        System.out.println("Задача 3.");
        int year=2021;
        int yearDays=365;//В 2021 году 365 дней
        if (yearDays==366)
            System.out.println(year+"год является високосным.");
        else if (yearDays==365)
            System.out.println(year+"год не является високосным.");


    }
    public static void task4(){
        System.out.println("Задача 4.");
    }
    public static void task5(){
        System.out.println("Задача 5.");
    }
    public static void task6(){
        System.out.println("Задача 6.");
    }
    public static void task7(){
        System.out.println("Задача 7.");
    }
}