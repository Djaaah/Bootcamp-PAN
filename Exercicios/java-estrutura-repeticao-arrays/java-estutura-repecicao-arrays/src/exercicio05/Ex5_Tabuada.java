package exercicio05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n;

        while (true) {
            try {
                System.out.print("Digite o número que deseja ver a tabuada: ");
                n = s.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Insira apenas números!");
                s.reset();
                s.next();
                continue;
            }
            break;
        }

        System.out.println("Exibindo a tabuada do: " + n);

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s x %s = %s\n", n, i, (i * n));
            // System.out.println(n + " x " + i + " = " + (i * n));
        }

        s.close();
    }
}
