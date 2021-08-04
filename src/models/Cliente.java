package models;

public class Cliente extends Pessoa {

    private int codigo;

    public Cliente(String nome, Data nascimento, int codigo) {
        super(nome, nascimento);
        this.codigo = codigo;
    }

    public void imprimeDados(){
        super.imprimeDados();
        System.out.print(", Código: " + this.codigo);
    }
}
