package br.com.matheus.exercicios.lista_loop;

public class Quadrado implements Forma{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

}
