package projeto_java;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        Moto minhaMoto = new Moto();

        System.out.println("--- Velocidade Inicial ---");
        System.out.println("Velocidade do Carro: " + meuCarro.velocidade + " km/h");
        System.out.println("Velocidade da Moto: " + minhaMoto.velocidade + " km/h");

        meuCarro.aumentarVelocidade();
        minhaMoto.aumentarVelocidade();

        System.out.println("\n--- Após Aumentar a Velocidade ---");
        System.out.println("Nova velocidade do Carro: " + meuCarro.velocidade + " km/h");
        System.out.println("Nova velocidade da Moto: " + minhaMoto.velocidade + " km/h");
    }
}