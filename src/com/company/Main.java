package com.company;

public class Main {

    public static void main(String[] args) {
        Plan(3);
    }

    public static int Plan(int date) {
        switch (date) {
            case 1:
                System.out.println("Понедельник:");
                System.out.println("1) математика");
                System.out.println("2) география");
                break;
            case 2:
                System.out.println("Вторник:");
                System.out.println("1) физика");
                System.out.println("2) химия");
                break;
            case 3:
                System.out.println("Среда:");
                System.out.println("1) физкультура");
                System.out.println("2) математика");
                break;
            case 4:
                System.out.println("Четверг:");
                System.out.println("1) геометрия");
                System.out.println("2) иностранный язык");
                break;
            case 5:
                System.out.println("Пятница:");
                System.out.println("1) черченик");
                System.out.println("2) физика");
                break;
            case 6:
                System.out.println("Суббота:");
                System.out.println("1) факультатив");
                System.out.println("2) художественная гимнастика");
                break;
            case 7:
                System.out.println("Воскресенье:");
                System.out.println("1) спать до 12");
                System.out.println("2) велопробег");
                break;
            default:
                System.out.println("Такого дня недели не существует");
        }
        return date;
    }
}
