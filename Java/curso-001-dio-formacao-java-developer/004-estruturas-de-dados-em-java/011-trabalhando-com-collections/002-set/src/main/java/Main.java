import java.util.*;

public class Main {
    public static void main(String[] args) {
        //#region Dada uma lista com 7 notas de um aluno (7, 8.5, 9.3, 5, 7, 8, 3.6), faça:

        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 8d, 3.6));
        System.out.println("\nCrie um conjunto e adicione as notas: " +notas);

        System.out.println("Confira se a nota 5.0 está no conjunto: " +notas.contains(5.0));
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext())
            soma += iterator.next();
        System.out.println("Exiba a soma dos valores: " +soma);

        System.out.println("Exiba a média das notas: " +soma/notas.size());
        System.out.println("remova a nota 5: " +notas.remove(5d) +"\t " +notas);

        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next() < 7d)
                iterator2.remove();
        }
        System.out.println("Remova as notas menores que 7 e exiba a lista: " +notas);

        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(8d);
        notas2.add(3.6);
        System.out.println("Exiba todas as notas na ordem em que foram informados: " +notas2);

        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println("Exiba todas as notas na ordem crescente: " +notas3);

        notas3.clear();
        System.out.println("Apague todo o conjunto: " +notas3);

        System.out.println("Confira se o conjunto está vazio: " +notas3.isEmpty());
        System.out.println("-------------------------------------------------------\n\n\n");
        //#endregion

        //#region Dadas as seguintes informações sobre minhas séries favoritas, crie um conjunto e ordene este exibindo:

        Set<Serie> series = new HashSet<>(){{
           add(new Serie("got","faltasia", 60));
           add(new Serie("dark","drama", 60));
           add(new Serie("that","comédia", 25));
        }};
        System.out.println("Ordem aleatória:");
        for(Serie serie: series)
            System.out.println(serie);

        Set<Serie> series2 = new LinkedHashSet<>(){{
            add(new Serie("got","faltasia", 60));
            add(new Serie("dark","drama", 60));
            add(new Serie("that","comédia", 25));
        }};
        System.out.println("\nOrdem de inserção:");
        for(Serie serie: series2)
            System.out.println(serie);

        System.out.println("\nOrdem Nome/Gênero/TempoEpisódio:");
        Set<Serie> series3 = new TreeSet<>(new CompareNomeGeneroTempo());;
        series3.addAll(series);

        for(Serie serie: series3)
            System.out.println(serie);

        //#endregion
    }
}

class CompareNomeGeneroTempo implements Comparator<Serie> {
    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}
