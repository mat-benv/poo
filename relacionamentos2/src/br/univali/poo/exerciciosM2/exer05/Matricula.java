package br.univali.poo.exerciciosM2.exer05;

public class Matricula {
    private final String dataMatricula;
    private double notaFinal;
    private final Aluno aluno;
    private final Turma turma;

    public Matricula(String data, Aluno a, Turma t){
        this.dataMatricula = data;
        this.aluno = a;
        this.turma = t;
        a.addMatricula(this);
        t.addMatricula(this);
        notaFinal = 0.0;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    void removeMatricula(){
        aluno.removeMatricula(this);
        turma.removeMatricula(this);
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "dataMatricula='" + dataMatricula + '\'' +
                ", notaFinal=" + notaFinal +
                ", aluno=" + aluno.getNome() +
                ", turma=" + turma.getNome() +
                '}';
    }
}
