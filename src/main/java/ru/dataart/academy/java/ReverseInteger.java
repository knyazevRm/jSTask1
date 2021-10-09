package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 12
     * -2,147,483,648 -> exception, error message
     */

    public int reverse(int inputNumber) {
        int result = 0;
        int number = (inputNumber < 0) ? -inputNumber : inputNumber;
        while (number > 0) {
            result *= 10;
            result += number % 10;
            number /= 10;
        }

        int sign = inputNumber < 0 ? -1 : 1;
        return result * sign;
    }
}
