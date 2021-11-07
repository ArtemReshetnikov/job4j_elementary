package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 420;
        float expectedEuro = 6;
        float expectedDollar = 7;
        float outEuro = Converter.rubleToEuro(in);
        float outDollar = Converter.rubleToDollar(in);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println(in + " rubles are " + outEuro + " euro.");
        System.out.println(in + " rubles are " + outDollar + " dollar.");
        System.out.println("420 rubles are 6 euro. Test result : " + passedEuro);
        System.out.println("420 rubles are 7 dollar. Test result : " + passedDollar);
    }
}