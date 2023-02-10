package edu.jailton.boletimestudantil;

public class BoletimEstudantil {
    private Double n1;
    private Double n2;
    private Double n3;
    private Double n4;
    private Double mediaFinal;

    public BoletimEstudantil(double n1, double n2, double n3, double n4) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }

    private Double getMediaFinal() {
        return mediaFinal;
    }

    private void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public String calcularMedia() {
        setMediaFinal((n1 + n2 + n3 + n4) / 4);
        return getMediaFinal().toString();
    }

}
