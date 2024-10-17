package br.com.matheus.exercicios.lista_loop;

public class Circulo implements Forma {
    private double raio;
    private static final double PI = Math.PI;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return PI * raio * raio;
    }
}