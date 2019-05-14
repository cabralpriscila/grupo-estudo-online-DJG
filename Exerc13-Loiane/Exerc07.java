//Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário

import java.util.Scanner;

public class Exerc07{
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int lado;

        System.out.println("Informe o valor do lado do quadrado: ");
        lado = entrada.nextInt();
        
        int area = lado * lado;
        int dobroArea = area * 2;

        System.out.println("O valor da área do quadrado é " + area);
        System.out.println("O valor do dobro da área do quadrado é " + dobroArea);
    }
}