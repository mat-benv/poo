package br.univali.poo.exerciciosM2.exer04;

public class Livro {

    private final String titulo;
    private final String autor;
    private boolean emprestado;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestimo() {
        this.emprestado = true;
    }

    public void devolucao(){
        this.emprestado = false;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", emprestado=" + emprestado +
                '}';
    }
}
