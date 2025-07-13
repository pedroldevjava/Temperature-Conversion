package application;

import entities.Temperature;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Temperature temperature = new Temperature();

        System.out.print("Put the temperature in Fahrenheit to convert:");
        double temp = sc.nextDouble();
        temperature.setCelsius(temp);

        temperature.convertTemperature();
        System.out.println("-------------");
        System.out.println("Result of conversion of temperatures in Celsius: " + temperature.convertTemperature());


        sc.close();
    }
}