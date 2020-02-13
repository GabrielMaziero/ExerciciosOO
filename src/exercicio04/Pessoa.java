package exercicio04;

public class Pessoa {

    private String nome;
    private int idade;
    private String cidadeNasc;

    public Pessoa(String nome, int idade, String cidadeNasc) {
        this.nome = nome;
        this.idade = idade;
        this.cidadeNasc = cidadeNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidadeNasc() {
        return cidadeNasc;
    }

    public void setCidadeNasc(String cidadeNasc) {
        this.cidadeNasc = cidadeNasc;
    }
}
