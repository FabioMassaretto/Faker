package com.itscreening.tests.faker;

import java.util.Random;
public class Faker {
    Random rnd = new Random();

    public String letterify(String letterString) {
        return letterString.replace("?", replaceToLetter());
    }

    public String numerify(String numberString) {
        return numberString.replace("#", replaceToNumber());
    }

    public String bothify(String string) {
        return replaceBoth(string);
    }

    private String replaceBoth(String str) {
        String newStr;
        newStr = str.replace("?", replaceToLetter());
        newStr = newStr.replace("#", replaceToNumber());

        return newStr;
    }

    private String replaceToLetter() {
        return String.valueOf((char) (rnd.nextInt(26) + 'a'));
    }

    private String replaceToNumber() {
        return String.valueOf(rnd.nextInt(9));
    }
}
