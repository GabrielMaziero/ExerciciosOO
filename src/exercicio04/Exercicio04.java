package exercicio04;

public class Exercicio04 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Joao",24,"São Paulo","343.444.328-40");
        Funcionario funcionario = new Funcionario("Jonas",30,"Parana",38383);


        cliente.exibirDados();
        System.out.println("**********************");
        funcionario.exibirDados();
    }
}
