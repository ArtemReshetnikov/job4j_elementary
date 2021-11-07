package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        int num = 7;
        boolean rsl = LogicNot.isEven(num);
        System.out.println(rsl);
        rsl = LogicNot.isPositive(num);
        System.out.println(rsl);
        rsl = LogicNot.notEven(num);
        System.out.println(rsl);
        rsl = LogicNot.notPositive(num);
        System.out.println(rsl);
        rsl = LogicNot.notEvenAndPositive(num);
        System.out.println(rsl);
        rsl = LogicNot.evenOrNotPositive(num);
        System.out.println(rsl);
    }
}