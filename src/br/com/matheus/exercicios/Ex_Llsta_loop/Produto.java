package br.com.matheus.exercicios.Ex_Llsta_loop;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}
