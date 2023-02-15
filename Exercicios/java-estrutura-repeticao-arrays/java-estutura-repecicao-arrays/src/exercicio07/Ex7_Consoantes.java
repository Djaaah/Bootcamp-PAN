package exercicio07;

import java.util.Scanner;

public class Ex7_Consoantes {
    public static void main(String[] args) {
        String[] letras = new String[6];
        int quantidadeConsoantes = 0;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < letras.length; i++) {
            System.out.printf("Digite a %sª letra: ", (i + 1));
            letras[i] = s.next();

            if (!(letras[i].equalsIgnoreCase("a") || letras[i].equalsIgnoreCase("e") || letras[i].equalsIgnoreCase("i")
                    || letras[i].equalsIgnoreCase("o") || letras[i].equalsIgnoreCase("u")))
                quantidadeConsoantes++;
        }

        System.out.printf("A quantidade de Consoantes é: %s", quantidadeConsoantes);

        s.close();

    }
}
