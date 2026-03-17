package br.univali.poo.exer01;

import java.util.Scanner;

public class ProdutoTeste {

    void main(){
        Scanner input = new Scanner(System.in);
        Produto lapis = new Produto("Lápis", 2.33);
        Produto geladeira = new Produto("Geladeira", 1600);

        System.out.printf(lapis.toString());
        System.out.printf(geladeira.toString());

        lapis.atualizaPreco(10);

        try{
            geladeira.fazerPromocao();
        } catch (RuntimeException e){
            System.out.printf("Exception: %s", e.getMessage());
        }

        try{
            lapis.fazerPromocao();
        } catch (RuntimeException e){
            System.out.printf("Exception: %s", e.getMessage());
        }

        System.out.printf(lapis.toString());
        System.out.printf(geladeira.toString());
    }

}
