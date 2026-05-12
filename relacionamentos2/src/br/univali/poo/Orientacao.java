package br.univali.poo;

public class Orientacao {
    private String tituloTrabalho;
    private final Aluno aluno;
    private final Professor professor;

    public Orientacao(Aluno a, Professor p, String titulo){
        this.aluno = a;
        this.professor = p;
        this.tituloTrabalho = titulo;
        a.setOrientacao(this);
        p.setOrientacao(this);
    }

    public String getTituloTrabalho() {
        return tituloTrabalho;
    }

    public void setTituloTrabalho(String tituloTrabalho) {
        this.tituloTrabalho = tituloTrabalho;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    @Override
    public String toString() {
        return "Orientacao{" +
                "tituloTrabalho='" + tituloTrabalho + '\'' +
                ", aluno=" + aluno +
                ", professor=" + professor +
                '}';
    }
}
