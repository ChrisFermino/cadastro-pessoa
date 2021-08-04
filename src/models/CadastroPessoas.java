package models;

import java.util.ArrayList;

public class CadastroPessoas {

    private int qtdAtual;
    private final ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void cadastraPessoa(Pessoa pessoa){
        this.pessoas.add(pessoa);
        qtdAtual++;
    }

    public void imprimeCadastro(){

        for (Pessoa pessoa: pessoas){
           pessoa.imprimeDados();
           System.out.println();
        }
        System.out.printf("\nNúmero de pessoas: " + qtdAtual);

    }

    
}
