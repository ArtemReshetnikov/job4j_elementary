package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short heightMan) {
        double rsl = heightMan * 1.15;
        return rsl;
    }

    public static double womanWeight(short heightWoman) {
        double rsl = heightWoman * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        double man = Fit.manWeight(heightMan);
        short heightWoman = 167;
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Man " + heightMan + " is " + man);
        System.out.println("Woman " + heightWoman + " is " + woman);
    }

}