package terminal_argumentos;

import java.util.Locale;
import java.util.Scanner;

public class Argumentos {
    public static void main(String[] args) {
        //criando um objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("nome: ");
        String nome = scanner.next();

        System.out.println("sobrenome: ");
        String sobrenome = scanner.next();
        
        System.out.println("altura: ");
        double altura = scanner.nextDouble();

        System.out.println("idade: ");
        int idade = scanner.nextInt();

        //imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
