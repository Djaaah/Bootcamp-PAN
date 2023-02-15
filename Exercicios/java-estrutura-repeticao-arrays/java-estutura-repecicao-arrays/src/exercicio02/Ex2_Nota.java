package exercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {

        int nota;

        Scanner s = new Scanner(System.in);

        while (true) {

            try {
                System.out.print("Digite a nota do Aluno: ");
                nota = s.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Insira apenas números!");
                s.reset();
                s.next();
                continue;
            }

            if (nota < 0 || nota > 10) {
                System.err.println("A nota deve estar entre 0 e 10!\nTente novamente!");
                continue;
            } else
                break;
        }

        System.out.println("O aluno teve nota: " + nota);

        s.close();
    }
}
