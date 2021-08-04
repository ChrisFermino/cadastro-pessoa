package models;

public class Gerente extends Funcionario {

    private String area;

    public Gerente(String nome, Data nascimento, int salario, String area) {
        super(nome, nascimento, salario);
        this.area = area;
    }

    public float calculaImposto(){
        return getSalario() * 0.05f;
    }


    @Override
    public void imprimeDados(){
        super.imprimeDados();
        System.out.print(", " + area);
    }
}
