public class TemperaturaMediaMensal {
    private String mes;
    private double temperatura;

    public TemperaturaMediaMensal(String mes, double temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "mes: " + mes + ", temperatura: " + temperatura;
    }

    public String ToStringTemperaturaAcimaDaMedia() {
        return mes + ": " + temperatura;
    }
}
