//Faça um programa que peça a temperatura em graus Fahrenheit, transforme e mostre em graus Celsius
//A fórmula é C = (F - 32) * 1.8

import java.util.Scanner;

public class Exerc10{
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        double temperaturaFahrenheit;

        System.out.println("Informe a temperatura em graus Celsius: ");
        temperaturaFahrenheit = entrada.nextDouble();

        double temperaturaCelsius = (temperaturaFahrenheit - 32) * 1.8;
        System.out.println(temperaturaFahrenheit + " F é igual a " + temperaturaCelsius + " ºC");
    }
}