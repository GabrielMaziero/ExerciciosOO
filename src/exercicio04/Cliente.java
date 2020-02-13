package exercicio04;

public class Cliente extends Pessoa {

    private String CPF;

    public Cliente(String nome, int idade, String cidadeNasc, String CPF) {
        super(nome, idade, cidadeNasc);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void exibirDados() {
        System.out.println("Nome: " + super.getNome() +
                "\nIdade: " + super.getIdade() +
                "\nCidade de Nascimento: " + super.getCidadeNasc() +
                "\nCPF: " + this.CPF);
    }
}
