package br.univali.poo.exerciciosM2.exer04;

public class Biblioteca {

    public static void registrarEmprestimo(Pessoa p, Livro l){
        p.emprestimo(l);
        l.emprestimo();
    }

    public static void registrarDevolucao(Pessoa p, Livro l){
        p.devolucao(l);
        l.devolucao();
    }

}
