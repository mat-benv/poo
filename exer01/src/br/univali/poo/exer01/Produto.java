package br.univali.poo.exer01;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return this.preco;
    }
    public String toString(){
        return
                String.format("Nome: %s\nPreço: %.2f\n", this.getNome(), this.getPreco());
    }
    public void atualizaPreco(int porcentagem){
        this.preco *= (1-(porcentagem*0.01));
    }
    public void fazerPromocao(){
        if(this.preco > 10){
            this.preco -= 10;
        } else {
            throw new RuntimeException("Produto custa menos que 10,00.\n");
        }
    }
}
