package org.cognizant.java_masterclass.section_03_first_steps_in_java_programming.lecture_022.challenge;

import java.util.Scanner;

public class FloatingPointChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of pounds: ");
        int pounds = scanner.nextInt();

        convertPoundsIntoKilograms(pounds);
    }

    public static void convertPoundsIntoKilograms(int pounds) {
        double conversionFactor = 0.45359237;
        double kilograms = pounds * conversionFactor;

        System.out.println( "'"+ pounds + " pounds' are equivalent to '" + kilograms + " kilograms'");
    }
}
