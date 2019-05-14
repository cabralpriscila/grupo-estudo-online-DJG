//Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
//Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o IR
//8% para o INSS, e 5% para o Sindicato.
//Faça um programa que nos dê:
//  O salário bruto
//  a. quanto pagou ao INSS
//  b. quanto pagou ao sindicato
//  c. o salário líquido
//  d. calcule os descontos e o salário líquido, conforme a tabela abaixo
//  + Salário Bruto R$: 
// - IR (11%) R$:
// - INSS (8%) R$:
// - Sindicato (5%) R$:
// = Salário Líquido R$:

import java.util.Scanner;

public class Exerc13{
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        double ganhoHora;
        double horasTrab;

        System.out.println("Informe o ganho por hora: ");
        ganhoHora = entrada.nextDouble();

        System.out.println("Informe o número de horas trabalhadas no mês: ");
        horasTrab = entrada.nextDouble();

        double salarioBruto = ganhoHora * horasTrab;
        double ir = (salarioBruto * 11) / 100;
        double inss = (salarioBruto * 8) / 100;
        double sindicato = (salarioBruto * 5) /100;
        double descontos = ir + inss + sindicato;
        double salarioLiquido = salarioBruto - descontos;

        System.out.printn("(+) Salário Bruto R$ ");
        System.out.printn("(-) IR (11%) R$ ");
        System.out.printn("(-) INSS (8%) R$ ");
        System.out.printn("(-) Sindicato (5%) R$ ");
        System.out.printn("\n(=) Salário Líquido R$ ");
    }
}