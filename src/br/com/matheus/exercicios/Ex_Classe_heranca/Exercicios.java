package br.com.matheus.exercicios.Ex_Classe_heranca;

public class Exercicios {
    public static void main(String[] args) {


        Cachorro meuCachorro = new Cachorro("Milly", 7,"Femea");
        meuCachorro.setRaca("pequinês");


        Animal animalCachorro = meuCachorro;

        System.out.println("Nome do animal: " + animalCachorro.getNome());
        System.out.println("Idade do animal: " + animalCachorro.getIdade());
        System.out.println("Tipo do animal: " + animalCachorro.getTipo());

        if (animalCachorro instanceof Cachorro) {
            Cachorro cachorroDowncast = (Cachorro) animalCachorro;
            System.out.println("Raça do cachorro: " + cachorroDowncast.getRaca());
        } else {
            System.out.println("O objeto não é uma instância de Cachorro");
        }

        // pattern matching com instanceof  Java 14+

        if (animalCachorro instanceof Cachorro cachorro) {
            System.out.println("Raça Java 14+: " + cachorro.getRaca());
        }


    }
}