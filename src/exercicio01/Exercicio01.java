package exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        Jogador neymar = new Jogador("Neymar", 0,10);
        Jogador maradona = new Jogador("Maradona", 0,20);
        Jogador zico = new Jogador("Zico", 0,20);



        neymar.fezGol();
        System.out.println("**********************");
        maradona.treinar();
        System.out.println("**********************");
        zico.fezGol();

    }

}
