//Maria está querendo saber quanto vale sua hora de trabalho dela e pediu sua ajuda nisso.
//Faça um programa que calcula o valor da hora de trabalho de Maria. Ela recebe um salário mensal de R$2.500,50 e trabalha 40h/semana.

//Crie uma classe chamada CalculoDaHora com um bloco main. No método main declare três variáveis (identifique qual o tipo mais adequado):

//salario (valor total do salário = R$2.500,50)
//horasSemana (qtas horas ela trabalha por semana = 40 horas)
//horasMes (qtas horas ela trabalha por mês. Utilize a variável anterior horasSemana para calcular a qtd de horas de 1 mês (1 mês = 4 semanas))
//Em seguida, crie outra variável chamada valorDaHora que possui o valor da hora de trabalho de Maria. Dica: use as variáveis salario e horasMes para calcular a hora de trabalho de Maria. Imprima o valor da hora de Maria. Seu programa deve imprimir algo assim:

//O valor da hora de trabalho de Maria é: XXXXX (XXXXX vai ser o valor que seu programa vai calcular)

public class CalculoDaHora{
    public static void main(String args[]) {
        double salario = 2500.50;
        int horasSemana = 40;
        int horasMes = horasSemana * 4;


        double valorDaHora = salario / horasMes;
        System.out.println("O valor da hora de trabalho de Maria é " + valorDaHora);
    }
}