package me.bnnq.utils;

import java.util.MissingFormatArgumentException;

public class NumberUtilities {
    public static boolean isLucky(int sixDigitNumber) {
        if (sixDigitNumber < 100000 || sixDigitNumber > 999999) {
            throw new MissingFormatArgumentException("Number must be 6 digits");
        }

        int firstPart = sixDigitNumber / 1000;
        int secondPart = sixDigitNumber % 1000;

        int firstPartSum = 0;
        int secondPartSum = 0;

        while (firstPart > 0) {
            firstPartSum += firstPart % 10;
            firstPart /= 10;
        }

        while (secondPart > 0) {
            secondPartSum += secondPart % 10;
            secondPart /= 10;
        }

        return firstPartSum == secondPartSum;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        int sqrtOfNum = (int) Math.sqrt(number);
        for (int i = 3; i <= sqrtOfNum; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
