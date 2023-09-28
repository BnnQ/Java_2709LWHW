package me.bnnq.utils;

public class ArrayUtilities
{
    public static void printArray(int[] array)
    {
        System.out.print("Elements of array: ");
        for (int element : array)
        {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static int getSumOfArray(int[] array)
    {
        int sum = 0;
        for (int element : array)
        {
            sum += element;
        }

        return sum;
    }

    public static int countNumberInArray(int[] array, int number) {
        int count = 0;
        for (int element : array) {
            if (element == number) {
                count++;
            }
        }

        return count;
    }

    public static double getAverageOfArray(int[] array)
    {
        return (double) getSumOfArray(array) / array.length;
    }

}
