package br.univali.poo;

import java.util.ArrayList;

public class Endereco {
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cep;
    private ArrayList<Pessoa> moradores;

    public Endereco(String rua, int numero, String complemento, String bairro, String cep){
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public ArrayList<Pessoa> getMoradores() {
        return moradores;
    }

    public void addMorador(Pessoa m){
        moradores.add(m);
    }

    public void removeMorador(Pessoa m){
        moradores.remove(m);
    }

    @Override
    public String toString() {
        return String.format(
                "%s, #d, %s\n%s, %s",
                getRua(), getNumero(), getComplemento(),
                getBairro(), getCep()
        );
    }
}
