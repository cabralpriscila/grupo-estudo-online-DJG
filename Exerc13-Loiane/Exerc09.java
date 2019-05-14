//Faça um programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit
//A fórmula é F = (C * 1.8) + 32

import java.util.Scanner;

public class Exerc09{
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        double temperaturaCelsius;

        System.out.println("Informe a temperatura em graus Celsius: ");
        temperaturaCelsius = entrada.nextDouble();

        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        System.out.println(temperaturaCelsius + " ºC é igual a " + temperaturaFahrenheit + " F");
    }
}