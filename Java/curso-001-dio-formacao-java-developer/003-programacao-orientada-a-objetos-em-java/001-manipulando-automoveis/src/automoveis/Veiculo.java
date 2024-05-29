package automoveis;

public abstract class Veiculo {
    private String chassi;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    // abstract obriga todas as classes que herdarem a classe Veiculo a
    // implementarem este método
    public abstract void ligar();
}
