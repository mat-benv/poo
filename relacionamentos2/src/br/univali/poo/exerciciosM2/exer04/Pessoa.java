package br.univali.poo.exerciciosM2.exer04;

import java.util.ArrayList;

public class Pessoa{
    private final String nome;
    private ArrayList<Livro> livrosEmprestados;

    public Pessoa(String nome){
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<Livro>();
    }

    public String getNome() {
        return nome;
    }

    public void emprestimo(Livro l) {
        livrosEmprestados.add(l);
    }

    public void devolucao(Livro l){
        livrosEmprestados.remove(l);
    }

    public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", livrosEmprestados=" + livrosEmprestados +
                '}';
    }
}
