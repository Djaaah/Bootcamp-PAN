import java.util.Scanner;

import edu.jailton.contabancaria.Conta;

public class Terminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        Integer opt = 0;

        Scanner lerTeclado = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        numero = lerTeclado.nextInt();

        System.out.print("Digite a agência sem o digito: ");
        agencia = lerTeclado.next();

        System.out.print("Digite o digito: ");
        agencia = agencia.concat("-").concat(lerTeclado.next());

        System.out.print("Digite seu nome completo: ");
        nomeCliente = lerTeclado.next();

        Conta minhaConta = new Conta(numero, agencia, nomeCliente);

        while (opt != 5) {
            System.out.println("---MENU---");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Meus dados");
            System.out.println("4 - Saldo Atual");
            System.out.println("5 - Encerrar Sessão");
            System.out.print("Opção Desejada: ");
            opt = lerTeclado.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("Digite o valor que deseja Sacar: ");
                    Double saque = lerTeclado.nextDouble();
                    minhaConta.sacar(saque);
                    break;
                case 2:
                    System.out.print("Digite o valor que deseja Depositar: ");
                    Double deposito = lerTeclado.nextDouble();
                    minhaConta.depositar(deposito);
                    break;
                case 3:
                    System.out.println("Nome Completo: " + minhaConta.getNomeCliente());
                    System.out.println("Número da conta: " + minhaConta.getNumero());
                    System.out.println("Agencia: " + minhaConta.getAgencia());
                    System.out.println("Saldo Atual: " + minhaConta.getSaldo());
                    System.out.println("-------------------------------");
                    break;
                case 4:
                    System.out.println("Saldo Atual: " + minhaConta.getSaldo());
                    System.out.println("-------------------------------");
                    break;
                case 5:
                    System.out.println("Encerrando Sistema...");
                    break;
                default:
                    System.out.println("Opção não encontrada!");
                    break;
            }
        }

        lerTeclado.close();

    }
}
