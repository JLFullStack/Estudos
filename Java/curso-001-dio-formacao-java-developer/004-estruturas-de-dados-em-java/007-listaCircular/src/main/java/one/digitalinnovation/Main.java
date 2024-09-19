package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> listaCircular = new ListaCircular<>();

        listaCircular.add("A");
        System.out.println(listaCircular);

        listaCircular.remove(0);
        System.out.println(listaCircular);

        listaCircular.add("A");
        listaCircular.add("B");
        listaCircular.add("C");
        listaCircular.add("D");
        listaCircular.add("E");

        System.out.println(listaCircular);
        System.out.println(listaCircular.get(0));
        System.out.println(listaCircular.get(1));
        System.out.println(listaCircular.get(2));
        System.out.println(listaCircular.get(10));

        for (int i = 0; i < 9; i++) {
            System.out.println(listaCircular.get(i));
        }
    }
}
