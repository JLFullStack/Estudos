import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //#region Comparação com Stream

        System.out.println("\n--\tOrdem aleatória\t---");
        Map<Integer, Contato> contatos = new HashMap<>() {{
            put(1, new Contato("Simba", 33333333, "teste111@dfdsfa.cocasm"));
            put(2, new Contato("Cami", 22222222, "teste222@dfdsfa.cocasm"));
            put(3, new Contato("Jon", 1111111, "teste333@dfdsfa.cocasm"));
        }};
        System.out.println(contatos);

        System.out.println("\n--\tOrdem número telefone\t---");
        Set<Map.Entry<Integer, Contato>> ordemTelefone = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> contato1, Map.Entry<Integer, Contato> contato2) {
                return Integer.compare(contato1.getValue().getTelefone(), contato2.getValue().getTelefone());
            }
        });
        ordemTelefone.addAll(contatos.entrySet());
        System.out.println(ordemTelefone);

        System.out.println("\n--\tOrdem nome\t---");
        Set<Map.Entry<Integer, Contato>> ordemNome = new TreeSet<>(Comparator.comparing(
            new Function<Map.Entry<Integer, Contato>, String>() {
                @Override
                public String apply(Map.Entry<Integer, Contato> contato) {
                    return contato.getValue().getNome();
                }
            }
        ));
        ordemNome.addAll(contatos.entrySet());
        System.out.println(ordemNome);

        System.out.println("\n--\tOrdem email\t---");
        Set<Map.Entry<Integer, Contato>> ordemEmail = new TreeSet<>(Comparator.comparing(
          contato -> contato.getValue().getEmail()));

        ordemEmail.addAll(contatos.entrySet());
        System.out.println(ordemEmail);

        System.out.println("---------\t<<<<<<<<>>>>>>>>>\t---------------");

        //#endregion

        //#region Stream API

        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("\nImprima todos os elementos dessa lista de String: ");
        //numerosAleatorios.forEach(System.out::println);
        //numerosAleatorios.stream().forEach(System.out::println);
        //numerosAleatorios.stream().forEach(s -> System.out.println(s));

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
        //numerosAleatorios.stream()
        //        .limit(5)
        //        .collect(Collectors.toSet())
        //        .forEach(System.out::println);

        System.out.print("\nTransforme esta lista de String em uma lista de números inteiros: ");
        List<Integer> IntergerList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(IntergerList);

        System.out.print("\nPegue os números pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> pares = IntergerList.stream()
                .filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList());
        System.out.println(pares);

        System.out.print("\nMostre a média dos números: ");
        IntergerList.stream()
            .mapToDouble(Integer::doubleValue)
            .average()
            .ifPresent(System.out::println);

        System.out.print("\nRemova os valores ímpares: ");
        IntergerList.removeIf(x -> x % 2 != 0);
        System.out.println(IntergerList);
        //#endregion
    }
}
