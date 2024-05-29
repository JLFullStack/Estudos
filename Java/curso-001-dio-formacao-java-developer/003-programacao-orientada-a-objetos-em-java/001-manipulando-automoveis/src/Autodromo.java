import automoveis.Carro;
import automoveis.Moto;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        Moto z400 = new Moto();

        jeep.setChassi("8954383");
        jeep.ligar();

        z400.setChassi("9833793");
        System.out.println("\nchassi da z400: " + z400.getChassi());
        z400.ligar();
    }
}
