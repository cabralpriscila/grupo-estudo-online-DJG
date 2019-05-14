//Crie uma classe chamada MeusDados com um bloco main. 
//O método main terá variáveis que irão guardar informações suas:

//nome
//idade
//altura (em metros, por exemplo 1.58)
//gostoDeJava (sim ou não?) - nessa tem que responder que sim hein hahahah
//Para cada variável determine qual o tipo é o mais adequado. Por exemplo, para guardar seu nome, o tipo adequado é String, portanto você vai declarar/inicializar a variável assim: String nome = "Seu nome vai aqui";

//No bloco main, declare e inicializa as variáveis contendo seus dados e em seguida imprima-as no console. Um exemplo de saída:

//Meu nome é: Taiza
//Minha idade é: 34
//Minha altura é: 1.60
//Eu gosto de Java: true

public class MeusDados{
    public static void main(String args[]) {
        String nome = "Priscila";
        int idade = 26;
        double altura = 1.68;
        boolean gostoDeJava = true;

        System.out.println("Meu nome é: " + nome);
        System.out.println("Minha idade é: " + idade);
        System.out.println("Minha altura é: " + altura);
        System.out.println("Eu gosto de Java? " + gostoDeJava);
    }
}