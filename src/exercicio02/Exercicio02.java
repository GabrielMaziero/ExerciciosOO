package exercicio02;

public class Exercicio02 {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(3, 4);
        Triangulo triangulo2 = new Triangulo(10, 3);
        Triangulo triangulo3 = new Triangulo(32, 45);

        System.out.println("O valor da area do triangulo é : " + triangulo1.area());
        System.out.println("O valor da area do triangulo é : " + triangulo2.area());
        System.out.println("O valor da area do triangulo é : " + triangulo3.area());
    }
}
