
/*
Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo: (nome - idade - cor);

Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/


import java.util.*;

public class OrdenandoList {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println("-----\t Ordem de Inserção \t-----");
        for (Gato gato : gatos) {
            System.out.println(gato);
        }

        System.out.println("\n-----\t Ordem Aleatória \t-----");
        Collections.shuffle(gatos);
        for (Gato gato : gatos) {
            System.out.println(gato);
        }

        System.out.println("\n-----\t Ordem Natual (Nome) \t-----");
        Collections.sort(gatos);
        for (Gato gato : gatos) {
            System.out.println(gato);
        }

        System.out.println("\n-----\t Ordem Idade \t-----");
        gatos.sort(Comparator.comparing(Gato::getIdade));
        for (Gato gato : gatos) {
            System.out.println(gato);
        }

     System.out.println("\n-----\t Ordem Cor \t-----");
        gatos.sort(Comparator.comparing(Gato::getCor));
        for (Gato gato : gatos) {
            System.out.println(gato);
        }

       System.out.println("\n-----\t Ordem Nome/Cor/Idade \t-----");
        gatos.sort(Comparator.comparing(Gato::getNome)
                .thenComparing(Gato::getCor)
                .thenComparing(Gato::getIdade));
        for (Gato gato : gatos) {
            System.out.println(gato);
        }

    }
}
