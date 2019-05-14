//Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
//Calcule e mostre o total do seu salário no referido mês

import java.util.Scanner;

public class Exerc08{
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        double valorHora;
        double horasTrabalhadas;

        System.out.println("Informe o valor da hora: ");
        valorHora = entrada.nextDouble();

        System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
        horasTrabalhadas = entrada.nextDouble();

        double salario = valorHora * horasTrabalhadas;
        System.out.println("Salário R$ " + salario);
        
    }
}