package edu.jailton.contabancaria;

public class Conta {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo = 0;

    public Conta(int numero, String agencia, String nomeCliente) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String depositar(Double v) {
        setSaldo(getSaldo() + v);
        System.out.println("R$ " + v + " " + "Depositado com Sucesso!");
        return "";
    }

    public String sacar(Double v) {
        if (this.saldo > v) {
            this.saldo -= v;
            System.out
                    .println("O saque de R$ " + v + " " + "Foi efetuado com sucesso");
            return "";
        } else {
            System.err.println("Saldo insuficiente!");
            return "";
        }
    }
}
