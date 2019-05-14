//Faça um programa que peça um número e então mostre a mensagem "O número informado foi: [número]"

import java.util.Scanner;

public class Exerc02{
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Informe um número: ");
        num = entrada.nextInt();

        System.out.println("O número informado foi: " + num);

    }
}