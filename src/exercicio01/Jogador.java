package exercicio01;

public class Jogador {
    private String nome;
    private int treino;
    private int gol;

    public Jogador(String nome, int treino, int gol) {
        this.nome = nome;
        this.treino = treino;
        this.gol = gol;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTreino() {
        return treino;
    }

    public void setTreino(int treino) {
        this.treino = treino;
    }

    public int getGol() {
        return gol;
    }

    public void setGol(int gol) {
        this.gol = gol;
    }

    public void fezGol(){
        this.gol++;
        System.out.println("Goooool \n " + getGol());
    }

    public void treinar(){
        this.treino ++;
        System.out.println("Voce adquiriu um ponto de treino.\n pontos: "+ getTreino());
    }
}
