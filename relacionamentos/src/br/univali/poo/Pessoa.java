package br.univali.poo;

import java.util.ArrayList;

public class Pessoa {
    private final String nome;
    private final String cpf;
    private final String rg;
    private Endereco endereco;
    private double divida;
    
    public Pessoa(String nome, String cpf, String rg, Endereco endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.divida = 0.0f;
        this.endereco = endereco;
        endereco.addMorador(this);
    }

    public void setEndereco(Endereco endereco) {
        this.endereco.removeMorador(this);
        this.endereco = endereco;
        endereco.addMorador(this);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public double getDivida() {
        return divida;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void atualizarDivida(Produtos p){
        divida += p.getPreco();
    }

    @Override
    public String toString() {
        return getNome() + "\n" +
                getCpf() + "\n" +
                getRg() + "\n" +
                getEndereco() + "\n" +
                getDivida() + "\n";
    }
}
