// 3. Celsius to Fahrenheit Conversion
// Write a program that takes the temperature in Celsius as input and converts
// it to Fahrenheit using the formula:
// Fahrenheit = (Celsius * 9/5) + 32.

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Celsius = sc.nextInt();

        double Fahrenheit = (Celsius * 9/5) + 32;

        System.out.println(Fahrenheit);


    }
}