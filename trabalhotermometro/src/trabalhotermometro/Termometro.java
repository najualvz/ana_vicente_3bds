package trabalhotermometro;

public class Termometro {
    // Atributo privado para garantir o encapsulamento
    private double temperatura;

    // Construtor padrão que inicia a temperatura em 20.0 graus
    public Termometro() {
        this.temperatura = 20.0;
    }

    // Método getter para permitir ler o valor atual
    public double getTemperatura() {
        return this.temperatura;
    }

    // Método setter com a regra de validação exigida
    public void setTemperatura(double novaTemperatura) {
        if (novaTemperatura < -10.0 || novaTemperatura > 50.0) {
            System.out.println("Aviso: A temperatura " + novaTemperatura + "°C está fora dos limites permitidos (-10.0°C a 50.0°C). Alteração ignorada!");
        } else {
            this.temperatura = novaTemperatura;
        }
    }
}

