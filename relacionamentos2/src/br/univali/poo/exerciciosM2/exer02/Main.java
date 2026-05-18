package br.univali.poo.exerciciosM2.exer02;

public class Main {
    public static void main(String[] args) {
        Lampada l1 = new Lampada("Philips", "branca");
        Embalagem e1 = new Embalagem((l1));

        System.out.println(l1);
        System.out.println(e1);

        e1 = null;

        System.out.println(l1);
        System.out.println(e1);
    }
}
