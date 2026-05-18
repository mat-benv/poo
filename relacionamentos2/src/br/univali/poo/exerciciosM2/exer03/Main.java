/*Composição (Todo/Parte forte, um objeto é composto por outro objeto, sendo que a parte
pode existir sem o todo). Objetivo: Criar uma classe simples que contém outra. Classe
Motor: atributos (tipo, potência), construtor, métodos (ligar). Classe Carro: atributos
(marca, modelo, e uma instância de Motor). Tarefa: Implementar construtores e um
método exibirDados() no Carro que mostre também os dados do Motor.
Dicas sobre Composição: a) Encapsulamento: mantenha os atributos da classe
"parte" privados. b) Construtor: inicialize o objeto contido no construtor da classe
principal*/


package br.univali.poo.exerciciosM2.exer03;

public class Main {
    static void main(String[] args) {

        Carro c1 = new Carro("Chevrolet", "Onix", "001", "2");

        System.out.println(c1);

    }
}
