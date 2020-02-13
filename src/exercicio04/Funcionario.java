package exercicio04;

public class Funcionario extends Pessoa {

    private int numeroMatricula;

    public Funcionario(String nome, int idade, String cidadeNasc, int numeroMatricula) {
        super(nome, idade, cidadeNasc);
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
    public void exibirDados() {
        System.out.println("Nome: " + super.getNome() +
                "\nIdade: " + super.getIdade() +
                "\nCidade de Nascimento: " + super.getCidadeNasc() +
                "\nNumero da Matricula: " + this.numeroMatricula);
    }

}
