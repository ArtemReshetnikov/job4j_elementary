package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expectedEuro = 2;
        float expectedDollar = 2.3333333F;
        float outEuro = Converter.rubleToEuro(in);
        float outDollar = Converter.rubleToDollar(in);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("140 rubles are " + outEuro + " euro.");
        System.out.println("140 rubles are " + outDollar + " dollar.");
        System.out.println("140 rubles are 2. Test result : " + passedEuro);
        System.out.println("140 rubles are 2.3333333. Test result : " + passedDollar);
    }
}