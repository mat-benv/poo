package br.univali.poo.exerciciosM2.exer05;

import java.util.ArrayList;

public class Turma {
    private final String nome;
    private ArrayList<Matricula> matriculas;

    public Turma(String nome){
        this.nome = nome;
        this.matriculas = new ArrayList<Matricula>();
    }

    public String getNome() {
        return nome;
    }

    public String exibitMatriculas() {
        String s = "";
        if(! matriculas.isEmpty()){
            for (Matricula m : matriculas) {
                s = s + m;
            }
        }
        return s;
    }

    public void addMatricula(Matricula m) {
        this.matriculas.add(m);
    }

    public void removeMatricula(Matricula m){
        matriculas.remove(m);
    }

    @Override
    public String toString() {
        return "Turma{" +
                "nome='" + nome + '\'' +
                ", matriculas=" + exibitMatriculas() +
                '}';
    }
}
