package br.com.matheus.exercicios.lista_loop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();

        formas.add(new Quadrado(5));
        formas.add(new Circulo(3));
        formas.add(new Quadrado(2.5));
        formas.add(new Circulo(1.5));

        for (Forma forma : formas) {
            System.out.printf("Área da forma: %.2f\n", forma.calcularArea());
        }
    }
}