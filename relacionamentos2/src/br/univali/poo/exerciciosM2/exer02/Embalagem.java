package br.univali.poo.exerciciosM2.exer02;

public class Embalagem {
    private Lampada lampada;

    public Embalagem(Lampada l){
        this.lampada = l;
    }

    public Lampada getLampada() {
        return lampada;
    }

    public void setLampada(Lampada lampada) {
        this.lampada = lampada;
    }

    public Lampada exibirLampada(){
        return lampada;
    }

    @Override
    public String toString() {
        return "Embalagem{" +
                "lampada=" + lampada +
                '}';
    }
}
