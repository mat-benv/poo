/*Classe de Associação (relacionamento complexo onde a associação em si possui
atributos próprios, comuns em relacionamento *-*). Exercício: Sistema Acadêmico.
Cenário: um Aluno pode se matricular em várias Turmas, e uma Turma tem vários
Alunos. É preciso guardar a data de matrícula e a nota final. Classes envolvidas: Aluno,
Turma, Matricula (Classe de Associação). Atributos da classe Matricula: dataMatricula,
notaFinal, aluno (referência), turma (referência). Tarefa: cadastrar um aluno em algumas
turmas e listar as matrículas de um aluno específico.*/


package br.univali.poo.exerciciosM2.exer05;

public class Main {
    static void main(String[] args) {

        Aluno a1 = new Aluno("Nicolas");
        Turma t1 = new Turma("POO");
        Turma t2 = new Turma("Estrutura da dados");

        System.out.printf("%S\n%S\n%S",a1, t1, t2);

        Matricula m1 = new Matricula("18/05/2026", a1, t1);
        Matricula m2 = new Matricula("10/05/2025", a1, t2);

        System.out.printf("%S\n%S\n%S",a1, t1, t2);

    }
}
