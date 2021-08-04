package models;

public abstract class Pessoa {

    final private String nome;
    final private Data nascimento;


    public Pessoa(String nome, Data nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public void imprimeDados(){
        System.out.print("Nome: " + this.nome + ", Data de Nascimento: " + this.nascimento);
    }
}
