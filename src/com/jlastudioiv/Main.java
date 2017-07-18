package com.jlastudioiv;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        double operand1 = Double.parseDouble(scanner.nextLine());
        double operand2 = Double.parseDouble(scanner.nextLine());
        System.out.println("operand1 = " + operand1);
        System.out.println("operand2 = " + operand2);
        System.out.println("");

        double sum = sum(operand1, operand2);
        double difference = difference(operand1, operand2);
        double division = division(operand1, operand2);
        double multiplicaion = multiplicaion(operand1, operand2);
        double remainder = remainder(operand1, operand2);

        showResults(sum, difference, division, multiplicaion, remainder);
    }

    public static double sum (double operand1, double operand2) {
        return operand1 + operand2;
    }

    public static double difference (double operand1, double operand2) {
        return operand1 - operand2;
    }

    public static double division (double operand1, double operand2) {
        return operand1 / operand2;
    }

    public static double multiplicaion (double operand1, double operand2) {
        return operand1 * operand2;
    }

    public static double remainder (double operand1, double operand2) {
        return operand1 % operand2;
    }

    public static void showResults (double sum, double difference, double division, double multiplicaion, double remainder) {
        System.out.println("sum = " + sum);
        System.out.println("difference = " + difference);
        System.out.println("division = " + division);
        System.out.println("multiplication = " + multiplicaion);
        System.out.println("remainder = " + remainder);
    }
}
