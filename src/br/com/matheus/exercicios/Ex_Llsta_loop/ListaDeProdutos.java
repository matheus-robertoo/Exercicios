package br.com.matheus.exercicios.Ex_Llsta_loop;

import java.util.ArrayList;
import java.util.List;

public class ListaDeProdutos {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Sabão", 1.49));
        produtos.add(new Produto("Biscoito", 3.49));
        produtos.add(new Produto("Carne", 17.99));
        produtos.add(new Produto("Detergente", 1.99));
        produtos.add(new Produto("Sal", 0.99));

        double total = 0.0;

        for (Produto produto : produtos) {
            total += produto.getPreco();
        }

        Double media = total / produtos.size();


        System.out.println("A média de valor da compra de: " + produtos.size() +  " produtos e: R$" + String.format("%.2f",media));

        System.out.printf("%.2f%n",total);
        System.out.printf("%.2f%n",media);

//Implementação de formatação a partir do java 15
        System.out.println("Valor Java 15: %.2f".formatted(total));
    }

}
