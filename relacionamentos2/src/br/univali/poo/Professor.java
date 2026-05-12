package br.univali.poo;

import java.util.ArrayList;

public class Professor extends Pessoa{
    private ArrayList<Orientacao> orientacoes;

    public Professor(String nome) {
        super(nome);
        this.orientacoes = new ArrayList<Orientacao>();
    }

    public String getOrientacoes() {
        if(orientacoes.isEmpty()) return null;
        String s = "";
        for(Orientacao o : orientacoes) {
            s = s + "\n\t" + o;
        }
        return s;
    }

    public void setOrientacao(Orientacao o) {
        this.orientacoes.add(o);
    }

    public void removeOrientacao(Orientacao o){
        orientacoes.remove(o);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome=" + getNome() +
                "orientados=" + orientacoes +
                '}';
    }
}
