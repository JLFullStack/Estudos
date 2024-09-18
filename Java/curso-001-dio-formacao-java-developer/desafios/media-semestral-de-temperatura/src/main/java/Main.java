import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<TemperaturaMediaMensal> temperaturas = new ArrayList<>();

        int count = 0;

        while (count <= 6) {
            System.out.print("\nDigite o mês: ");
            String mes = scan.next();

            System.out.print("Digite a temperatura: ");
            double temp = scan.nextDouble();

            temperaturas.add(new TemperaturaMediaMensal(mes, temp));
            count++;
        }

        count = 0;

        //exibindo todas as temperaturas:
        System.out.print("\nTodas as temperaturas: ");
        temperaturas.forEach(t -> System.out.print("\n" + t));

        double media = temperaturas.stream()
                .mapToDouble(TemperaturaMediaMensal::getTemperatura)
                .average()
                .orElse(0d);

        System.out.printf("\n\nMédia das temperaturas: %.1f", media);

        //exibindo as temperaturas acima da média
        System.out.print("\n\nMeses em que a temperatura ficou acima da média: ");
        int finalCount = count;

        temperaturas.stream()
                .filter(t -> t.getTemperatura() > media)
                .forEach(t -> System.out.printf("\n" +(finalCount +1) + " - " +t.ToStringTemperaturaAcimaDaMedia()));
    }
}
