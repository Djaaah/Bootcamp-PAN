package edu.jailton.calculadora;

public class Calculadora {
    private Double n1;
    private Double n2;
    private Double resultado;

    public Calculadora(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    private Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public String operacoes(String operacao) {
        switch (operacao) {
            case "somar":
                setResultado(n1 + n2);
                return getResultado().toString();
            case "subtrair":
                setResultado(n1 - n2);
                return getResultado().toString();
            case "dividir":
                setResultado(n1 / n2);
                return getResultado().toString();
            case "multiplicar":
                setResultado(n1 * n2);
                return getResultado().toString();
            default:
                return "Operação não reconhecida!\nTente Novamente com: somar, subtrair, dividir ou multiplicar";

        }

    }

}
