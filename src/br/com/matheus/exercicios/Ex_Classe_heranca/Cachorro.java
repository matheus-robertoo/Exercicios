package br.com.matheus.exercicios.Ex_Classe_heranca;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String tipo) {
        super(nome, idade, tipo);
        this.raca = raca;


    }

    public String getRaca(){
        return raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", raca='" + raca + '\'' +
                '}';
    }


}
