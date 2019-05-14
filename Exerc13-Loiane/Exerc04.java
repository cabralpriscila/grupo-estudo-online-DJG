//Faça um programa que peça 4 notas bimestrais e mostre a média

import java.util.Scanner;

public class Exerc04{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;

        System.out.println("Nota do 1º Bimestre: ");
        nota1 = entrada.nextDouble();

        System.out.println("Nota do 1º Bimestre: ");
        nota2 = entrada.nextDouble();

        System.out.println("Nota do 1º Bimestre: ");
        nota3 = entrada.nextDouble();

        System.out.println("Nota do 1º Bimestre: ");
        nota4 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Média: " + media);

    }
}