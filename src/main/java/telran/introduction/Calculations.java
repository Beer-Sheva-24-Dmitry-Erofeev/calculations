package telran.introduction;

public class Calculations {

    public static int sum(int op1, int op2) {
        int result = op1 + op2;
        return result;
    }

    public static int multiply(int op1, int op2) {
        int result = op1 * op2;
        return result;
    }

    public static int divide(int op1, int op2) {
        int result = op1 / op2;
        return result;
    }

    public static int substract(int op1, int op2) {
        int result = op1 - op2;
        return result;
    }

// Method of finding a digit sum of a given number
    public static int sumOfDigits(int number) {

        int sumTotal = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            sumTotal += lastDigit;
            number /= 10;
        }
        return sumTotal;
    }

// Method of finding a maximum digit in a given number
    public static int maxDigit(int number) {

        int maxDigit = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            if (lastDigit > maxDigit) {
                maxDigit = lastDigit;
            }
            number /= 10;
        }
        return maxDigit;
    }

// Method of finding out if a given number is divided with or without remainder
    public static boolean isDividedOn(int number, int divider) {

        int remainder = number % divider;

        return remainder == 0;
    }

}
