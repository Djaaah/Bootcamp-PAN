package exercicio03;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int cont = 0;
        double media = 0;
        int[] numeros = new int[5];

        do {
            try {
                System.out.printf("Digite o %sª número: ", (cont + 1));
                numeros[cont] = s.nextInt();
                cont++;
            } catch (InputMismatchException e) {
                System.err.println("Insira apenas números!");
                s.reset();
                s.next();
                continue;
            }

        } while (cont < 5);

        for (int i = 0; i < numeros.length; i++) {
            media += numeros[i];
        }

        media = media / numeros.length;
        Arrays.sort(numeros);
        System.out.printf("Maior número: %s", numeros[numeros.length - 1]);
        System.out.println("");
        System.out.printf("Média dos números informados: %s", media);

        s.close();

    }
}
