package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();

        lista.add("primeiro");
        lista.add("segundo");
        lista.add("terceiro");
        lista.add("quarto");
        lista.add("quinto");

        System.out.println(lista);

        lista.remove(2);
        lista.add(2, "último");
        System.out.println(lista);
    }
}
