package br.univali.poo.exerciciosM2.exer01;

public class Aviao {
    private final String modelo;
    private final String prefixo;
    private Piloto piloto;

    public Aviao(String modelo, String prefixo){
        this.modelo = modelo;
        this.prefixo = prefixo;
        this.piloto = null;
    }

    public void assinarPiloto(Piloto p){
        this.piloto = p;
        p.addAviao(this);
    }

    public String getModelo() {
        return modelo;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "modelo='" + modelo + '\'' +
                ", prefixo='" + prefixo + '\'' +
                ", piloto=" + piloto.getNome() +
                '}';
    }
}
