package br.univali.poo.exerciciosM2.exer03;

public class Motor {
    private final String tipo;
    private final String potencia;

    public Motor(String t, String p){
        this.tipo = t;
        this.potencia = p;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "tipo='" + tipo + '\'' +
                ", potencia='" + potencia + '\'' +
                '}';
    }
}
