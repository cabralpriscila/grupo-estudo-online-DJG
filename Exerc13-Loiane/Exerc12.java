//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
//(72.7 * altura) - 58

import java.util.Scanner;

public class Exerc12{
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        double altura;

        System.out.println("Informe a altura: ");
        altura = entrada.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("Baseado na sua altura, o seu peso ideal seria de " + pesoIdeal + " Kg");
    }
}