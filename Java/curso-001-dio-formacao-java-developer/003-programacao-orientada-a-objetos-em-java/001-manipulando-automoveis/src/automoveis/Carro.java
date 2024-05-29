package automoveis;

public class Carro extends Veiculo {
    public void ligar(){
        verificarCambio();
        verificarCombustivel();
        System.out.println("CARRO LIGADO");
    }

    private void verificarCombustivel(){
        System.out.println("verificando combustível");
    }

    private void verificarCambio(){
        System.out.println("verificando câmbio em P");
    }
}
