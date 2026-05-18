package br.univali.poo.exerciciosM2.exer04;

public class Main {
    static void main(String[] args) {

        Livro l1 = new Livro("Retrato de Dorian Grey", "Oscar Wilde");
        Livro l2 = new Livro("1984", "George Orwell");
        Pessoa p1 = new Pessoa("Dante Martins Benvenutti");

        Biblioteca.registrarEmprestimo(p1, l1);
        Biblioteca.registrarEmprestimo(p1, l2);

        System.out.printf("%s\n%s\n%s\n", l1,l2,p1);

        Biblioteca.registrarDevolucao(p1, l1);

        System.out.printf("%s\n%s\n%s\n", l1,l2,p1);

    }
}
