package trabalhotermometro;

public class Main {
    public static void main(String[] args) {
        // 1. Instancia o termômetro (inicia automaticamente em 20.0°C)
        Termometro termometro = new Termometro();
        System.out.println("Temperatura inicial: " + termometro.getTemperatura() + "°C");

        // 2. Muda a temperatura para um valor válido
        System.out.println("\n--- Testando valor válido (25.5°C) ---");
        termometro.setTemperatura(25.5);
        System.out.println("Temperatura atual: " + termometro.getTemperatura() + "°C");

        // 3. Tenta mudar para um valor inválido (abaixo de -10.0°C)
        System.out.println("\n--- Testando valor inválido abaixo do limite (-15.0°C) ---");
        termometro.setTemperatura(-15.0);
        System.out.println("Temperatura atual (permanece a anterior): " + termometro.getTemperatura() + "°C");

        // 4. Tenta mudar para um valor inválido (acima de 50.0°C)
        System.out.println("\n--- Testando valor inválido acima do limite (60.0°C) ---");
        termometro.setTemperatura(60.0);
        System.out.println("Temperatura final do sistema: " + termometro.getTemperatura() + "°C");
    }
}