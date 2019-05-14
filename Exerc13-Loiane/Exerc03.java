//Faça um programa que peça dois números e imprima a soma

import java.util.Scanner;

public class Exerc03{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Informe o primeiro número: ");
        num1 = entrada.nextInt();

        System.out.println("Informe o segundo número: ");
        num2 = entrada.nextInt();

        int soma = num1 + num2;
        System.out.println("A soma de " + num1 + " + " + num2 + " é igual a " + soma);
    }
}