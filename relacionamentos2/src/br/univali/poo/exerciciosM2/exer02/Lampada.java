package br.univali.poo.exerciciosM2.exer02;

public class Lampada {
    private String marca;
    private String cor;

    public Lampada(String marca, String cor){
        this.marca = marca;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Lampada{" +
                "marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
