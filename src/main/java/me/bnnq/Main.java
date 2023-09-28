package me.bnnq;

import me.bnnq.utils.*;

import java.util.MissingFormatArgumentException;
import java.util.stream.IntStream;

@SuppressWarnings("unused")
public class Main
{
    public static void main(String[] args)
    {
        firstTask();
    }

    public static void firstTask()
    {
        String[] parts = new String[]{"Fall seven times", "and", "stand up eight"};

        for (String part : parts)
        {
            System.out.println(part);
        }
    }

    public static void secondTask()
    {
        System.out.println("Enter a first number: ");
        int firstNumber = ScannerUtilities.scanInt();

        System.out.println("Enter a second number: ");
        int secondNumber = ScannerUtilities.scanInt();

        System.out.println("Enter an operation (+, -, /, *): ");
        char operation = ScannerUtilities.scanChar();

        switch (operation)
        {
            case '+':
                System.out.printf("%d + %d = %d", firstNumber, secondNumber, Calculator.add(firstNumber, secondNumber));
                break;
            case '-':
                System.out.printf("%d - %d = %d", firstNumber, secondNumber, Calculator.subtract(firstNumber, secondNumber));
                break;
            case '*':
                System.out.printf("%d * %d = %d", firstNumber, secondNumber, Calculator.multiply(firstNumber, secondNumber));
                break;
            case '/':
                System.out.printf("%d / %d = %d", firstNumber, secondNumber, Calculator.divide(firstNumber, secondNumber));
                break;
            default:
                System.err.println("Invalid operation");
        }

    }

    public static void thirdTask()
    {
        System.out.println("Enter a number: ");
        String string = ScannerUtilities.scanString();

        try
        {
            Integer.parseInt(string);
        } catch (NumberFormatException e)
        {
            System.err.println("Invalid number");
            return;
        }

        System.out.println("Reversed number: " + StringUtilities.reverse(string));
    }

    public static void fourthTask()
    {
        System.out.println("Enter a number of hours (0-23): ");
        int hours = ScannerUtilities.scanInt();

        if (hours < 0 || hours > 23)
        {
            System.err.println("Invalid number of hours");
            return;
        }

        System.out.printf("Good %s", hours < 6 ? "Night" : hours < 13 ? "morning" : hours < 17 ? "day" : "evening");
    }

    public static void fifthTask()
    {
        System.out.println("Enter a six digit number: ");
        int number = ScannerUtilities.scanInt();

        try
        {
            System.out.printf("%d %s lucky number", number, NumberUtilities.isLucky(number) ? "is" : "is not");
        } catch (MissingFormatArgumentException e)
        {
            System.err.println("You must enter a six digit number");
        }
    }

    public static void sixthTask()
    {
        System.out.println("Enter a number in range 1-100:");
        int number = ScannerUtilities.scanInt();

        if (number < 1 || number > 100)
        {
            System.err.println("Invalid number");
            return;
        }

        if (number % 3 == 0)
        {
            System.out.print("Fizz ");
        }

        if (number % 5 == 0)
        {
            System.out.print("Buzz");
        }

        if (number % 3 != 0 && number % 5 != 0)
        {
            System.out.print(number);
        }

    }

    public static void seventhTask()
    {
        System.out.println("Enter a number: ");
        int number = ScannerUtilities.scanInt();

        System.out.printf("%d! = %d", number, Calculator.factorial(number));
    }

    public static void eighthTask()
    {
        System.out.println("Enter a left bound of range: ");
        int leftBound = ScannerUtilities.scanInt();

        System.out.println("Enter a right bound of range: ");
        int rightBound = ScannerUtilities.scanInt();

        System.out.print("Prime numbers in range: ");
        for (int i = leftBound; i <= rightBound; i++)
        {
            if (NumberUtilities.isPrime(i))
            {
                System.out.printf("%d ", i);
            }
        }

    }

    public static void ninthTask()
    {
        System.out.print("Enter number of elements: ");
        int numberOfElements = ScannerUtilities.scanInt();
        int[] array = ScannerUtilities.scanIntArray(numberOfElements);

        ArrayUtilities.printArray(array);
        System.out.printf("Sum of elements: %d\n", ArrayUtilities.getSumOfArray(array));
        System.out.printf("Average of elements: %.2f\n", ArrayUtilities.getAverageOfArray(array));
    }

    public static void tenthTask() {
        System.out.print("Enter number of elements: ");
        int numberOfElements = ScannerUtilities.scanInt();
        int[] array = ScannerUtilities.scanIntArray(numberOfElements);

        System.out.print("Enter a number to count: ");
        int number = ScannerUtilities.scanInt();

        System.out.printf("Number of %d in array: %d", number, ArrayUtilities.countNumberInArray(array, number));
    }

    public static void eleventhTask() {
        System.out.print("Enter a left bound of range: ");
        int leftBound = ScannerUtilities.scanInt();

        System.out.print("Enter a right bound of range: ");
        int rightBound = ScannerUtilities.scanInt();

        int sum = IntStream.rangeClosed(leftBound, rightBound).sum();
        System.out.printf("Sum of numbers in range: %d", sum);
    }

    public static int[] twelfthTask() {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayOfFactorials = new int[array.length];

        for (int element : array) {
            arrayOfFactorials[element] = Calculator.factorial(element);
        }

        return arrayOfFactorials;
    }

}