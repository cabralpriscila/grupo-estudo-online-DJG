//Faça um programa que peça o raio de um círculo, calcule e mostre sua área
//A fórmula pra calcular a área do círculo é: A = Pi * raio²
import java.util.Scanner;

public class Exerc06{
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        double raio;

        System.out.println("Informe o raio do círculo: ");
        raio = entrada.nextDouble();

        double area = Math.PI * (raio * raio);
        System.out.println("A área do círculo é " + area);
    }
}