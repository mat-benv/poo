package br.univali.poo.exerciciosM2.exer01;

import java.util.ArrayList;

public class Piloto {
    private String nome;
    private final String cpf;
    private ArrayList<Aviao> avioes;

    public Piloto(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.avioes = new ArrayList<Aviao>();
    }

    public void addAviao(Aviao a){
        avioes.add(a);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getAvioes() {
        if(avioes.isEmpty()) return null;
        String s = "";
        for(Aviao a : avioes){
            s = s + "\n\t" + a.getPrefixo() + " " + a.getModelo();
        }
        return s;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", avioes=" + avioes +
                '}';
    }
}
