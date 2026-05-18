package br.univali.poo.exerciciosM2.exer03;

public class Carro {
    private final String marca;
    private final String modelo;
    private Motor motor;

    public Carro(String marca, String modelo, String tipo, String potencia){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(tipo, potencia);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(String tipo, String potencia) {
        this.motor = new Motor(tipo, potencia);
    }

    public void exibirDados(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor=" + motor +
                '}';
    }
}
