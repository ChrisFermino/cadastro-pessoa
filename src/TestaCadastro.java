import models.*;

public class TestaCadastro {

    public static void main(String[] args) {

        CadastroPessoas cadastro = new CadastroPessoas();

        Pessoa pessoa1 = new Funcionario("Christian", new Data("26/03/1998"), 1000);
        cadastro.cadastraPessoa(pessoa1);

        Pessoa pessoa2 = new Gerente("João", new Data("01/01/2000"), 1500, "Gerente");
        cadastro.cadastraPessoa(pessoa2);

        Pessoa pessoa3 = new Cliente("Maria", new Data("02/02/1999"), 10);
        cadastro.cadastraPessoa(pessoa3);

        cadastro.imprimeCadastro();
    }
}
