package exercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int qtdNumeros;
        int pares = 0;
        int impares = 0;
        int numero;

        while (true) {
            try {
                System.out.print("Digite a quantidade de números que irá inserir: ");
                qtdNumeros = s.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Insira apenas números!");
                s.reset();
                s.next();
                continue;
            }
            break;
        }

        System.out.println("0 é considerado neutro, e será desconsiderado na contagem de pares e impares!");

        for (int i = 0; i < qtdNumeros; i++) {

            while (true) {
                try {
                    System.out.printf("Digite o %sª numero: ", (i + 1));
                    numero = s.nextInt();
                } catch (InputMismatchException e) {
                    System.err.println("Insira apenas números!");
                    s.reset();
                    s.next();
                    continue;
                }
                if (numero == 0)
                    break;
                else if (numero % 2 == 0)
                    pares++;
                else
                    impares++;
                break;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números impares: " + impares);

        s.close();

    }
}
