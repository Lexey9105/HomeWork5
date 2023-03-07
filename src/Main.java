public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }


    private static void task1() {
        // Задача 1
        boolean clientOS = true;
        if (clientOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
    }


    private static void task2() {
        // Задача 2
        int clientDeviceYear = 2014;
        boolean clientOS = false;
        if (clientOS && clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS && clientDeviceYear >= 2015) {
            System.out.println(" Установите версию приложения для Android по ссылке");
        } else if (clientOS == false && clientDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOS == false && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
    }

    private static void task3() {
        // Задача 3
        int yearLeap = 2021;
        boolean leapTrue = yearLeap % 4 == 0;
        boolean trueLeap = yearLeap % 400 == 0;
        boolean leapFalse = yearLeap % 100 == 0;
        if (leapTrue && trueLeap && leapFalse) {
            System.out.println(yearLeap + " високосный");
        } else if (leapTrue != leapFalse) {
            System.out.println(yearLeap + " високосный");
        } else {
            System.out.println(yearLeap + " невисокосный");
        }
    }

    private static void task4() {
        //Задача 4
        int deliveryDistance = 94;
        int deliveryDays = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            if (deliveryDistance > 20) {
                deliveryDays++;
            }
            if (deliveryDistance > 60) {
                deliveryDays++;
            }
            System.out.println("Потребуется дней: " + deliveryDays);
        }

    }

    private static void task5() {
        //Задача 5
        int monthNumber = 12;

        switch (monthNumber) {
            case (1):
                System.out.println("Зима");
                break;
            case (2):
                System.out.println("Зима");
                break;
            case (3):
                System.out.println("Весна");
                break;
            case (4):
                System.out.println("Весна");
                break;
            case (5):
                System.out.println("Весна");
                break;
            case (6):
                System.out.println("Лето");
                break;
            case (7):
                System.out.println("Лето");
                break;
            case (8):
                System.out.println("Лето");
                break;
            case (9):
                System.out.println("Осень");
                break;
            case (10):
                System.out.println("Осень");
                break;
            case (11):
                System.out.println("Осень");
                break;
            case (12):
                System.out.println("Зима");
                break;
            default:
                System.out.println("Укажите правильный месяц");
        }
    }
}











