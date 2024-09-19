package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<>();

        fila.enqueue("primeiro");
        fila.enqueue("segundo");
        fila.enqueue("terceiro");
        fila.enqueue("quarto");

        System.out.println(fila);
        System.out.println(fila.dequeue());
        System.out.println(fila);

        fila.enqueue("último");
        System.out.println(fila);

        System.out.println(fila.first());
        System.out.println(fila);
    }
}
