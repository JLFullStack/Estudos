public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 10; numero++) {

            // para o laço de repetição quando o número for igual 10
            if (numero == 10)
                break;

            // pula a impressão de todos os números ímpares
            if (numero % 2 != 0) {
                continue; // usado para pular as ações do laço de repetição
            }

            System.out.println("Número: " + numero);
        }
    }
}
