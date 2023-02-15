package exercicio06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {

        int n;
        int f = 1;

        Scanner s = new Scanner(System.in);

        while (true) {

            try {
                System.out.print("Digite o número que deseja o fatorial: ");
                n = s.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Insira apenas números!");
                s.reset();
                s.next();
                continue;
            }
            break;
        }

        for (int i = n; i >= 1; i--) {
            f = f * i;
        }

        System.out.printf("%s! = %s", n, f);
        s.close();

    }
}
