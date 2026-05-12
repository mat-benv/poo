package br.univali.poo;

public class Aluno extends Pessoa{
    private Orientacao orientacao;

    public Aluno(String nome) {
        super(nome);
        this.orientacao = null;
    }

    public Professor getOrientador() {
        return orientacao.getProfessor();
    }

    public void setOrientacao(Orientacao orientacao) {
        this.orientacao = orientacao;
    }

    public Orientacao getOrientacao() {
        return orientacao;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome=" + getNome() +
                "orientador=" + orientacao +
                '}';
    }
}
