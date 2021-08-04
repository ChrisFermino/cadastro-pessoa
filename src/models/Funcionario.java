package models;

public class Funcionario extends Pessoa {

    private float salario;

    public Funcionario(String nome, Data nascimento ,float salario) {
        super(nome , nascimento);
        this.salario = salario;
    }

    public float calculaImposto(){
        return salario * 0.03f;
    }

    public void imprimeDados(){
        super.imprimeDados();
        System.out.print(", Salário: " + this.salario + ", Imposto: " + calculaImposto());
    }

    public float getSalario() {
        return salario;
    }
}
