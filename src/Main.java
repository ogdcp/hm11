import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static boolean checkYear(int year){
        boolean checkYearIsLeap;
        checkYearIsLeap= (year % 4==0) && (year % 100 !=0 ) || (year % 400==0);
        return checkYearIsLeap;
    }


    public static void task1 () {
        System.out.println("Задача 1");
           int year= 2001;
        if (checkYear(year)) {
            System.out.println(year + " год является високосным");
        }else {
            System.out.println(year + " год не является високосным");
        }

    }


    public static void task2 () {
        System.out.println("Задача 2");
        Scanner scanner= new Scanner(System.in);
        int chooseSystem= scanner.nextInt();
        int chooseYear= scanner.nextInt();
        chooseOperatingSystemYearRelase(chooseSystem,chooseYear);
    }
    public static void chooseOperatingSystemYearRelase(int system,int year) {
        if (year > 2015) {
            switch (system) {
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            switch (system) {
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        Scanner scanner = new Scanner(System.in);
        int chooseDeliveryDistance = scanner.nextInt();
        int chooseDay = chooseDistance(chooseDeliveryDistance);
        if (chooseDay==4) {
            System.out.println("Свыше 100 км доставки нет");
        } else {
            System.out.println("Потребуется дней: " + chooseDay);
        }
    }
    public static int chooseDistance(int delivery) {
        int time = 0;
        if (delivery<20){
            time ++;
        } else if (delivery<60) {
            time = 2;
        } else if (delivery<100) {
            time = 3;
        } else {
            time = 4;
        }
        return (time);
    }
    }



