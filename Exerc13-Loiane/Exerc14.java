//Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de internet (em Mbps).
//Calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos)

import java.util.Scanner;

public class Exerc14{
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        double tamanhoArquivo;
        double velocidadeLInk;

        System.out.println("Informe o tamanho do arquivo em MB: ");
        tamanhoArquivo = entrada.nextDouble();

        System.out.println("Informe a velocidade em Mbps: ");
        velocidadeLInk = entrada.nextDouble();

        double tempoAproximado = tamanhoArquivo / velocidadeLInk;
        System.out.println("O tempo aproximado de download é de " + tempoAproximado + " min.");
    }
}