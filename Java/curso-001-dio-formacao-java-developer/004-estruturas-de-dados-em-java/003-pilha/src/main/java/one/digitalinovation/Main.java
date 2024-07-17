package one.digitalinovation;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        for (int i = 1; i <= 10; i++) {
            pilha.push(new No(i));
        }

        System.out.println(pilha);

        System.out.println(pilha.pop());
        System.out.println(pilha);

        pilha.push(new No(99));
        System.out.println(pilha);
    }
}
