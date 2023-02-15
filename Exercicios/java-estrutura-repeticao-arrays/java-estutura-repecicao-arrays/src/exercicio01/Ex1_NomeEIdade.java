package exercicio01;

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {

        String nome = "";
        int idade;

        Scanner lerTeclado = new Scanner(System.in);

        while (true) {

            System.out.print("Digite seu nome[digite 0 para sair]: ");
            nome = lerTeclado.next();

            if (nome.equals("0"))
                break;

            System.out.print("Digite sua idade: ");
            idade = lerTeclado.nextInt();

            System.out.println("Olá, " + nome + " de " + idade + " anos!");
        }

        lerTeclado.close();

    }
}