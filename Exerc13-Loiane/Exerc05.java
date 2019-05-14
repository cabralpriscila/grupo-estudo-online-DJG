//Faça um programa que converta metros para centimetros

import java.util.Scanner;

public class Exerc05{
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        double metros;

        System.out.println("Informe a quantidade em metros: ");
        metros = entrada.nextDouble();

        double cm = metros * 100;
        System.out.println(metros + "M é igual a " + cm + " cm.");
    }
}