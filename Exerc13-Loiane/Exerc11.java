//Faça um programa que peça dois números inteiros e um número real, calcule e mostre
//  a. o produto do dobro do primeiro com metade do segundo
//  b. a soma do triplo do primeiro com o terceiro
//  c. o terceiro elevado ao cubo

import java.util.Scanner;

public class Exerc11{
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        double num3;

        System.out.println("Informe o primeiro número inteiro: ");
        num1 = entrada.nextInt();

        System.out.println("Informe o primeiro número inteiro: ");
        num2 = entrada.nextInt();

        System.out.println("Informe o primeiro número inteiro: ");
        num3 = entrada.nextDouble();
        
        int resultadoA = (num1 * 2) + (num2 / 2);
        double resultadoB = (num1 * 3) + num3;
        double resultadoC = Math.pow(num3, 3);

        System.out.println("Resultado A: " + resultadoA);
        System.out.println("Resultado B: " + resultadoB);
        System.out.println("Resultado C: " + resultadoC);
    }
}