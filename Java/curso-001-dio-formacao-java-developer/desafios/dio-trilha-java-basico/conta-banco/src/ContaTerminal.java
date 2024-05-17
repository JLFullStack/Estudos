import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //criando um objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta !");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite sua Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome !");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu saldo !");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldoConta + " já está disponível para saque.");
    }
}
