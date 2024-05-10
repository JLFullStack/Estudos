package tipos_e_variaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        //double salarioMinimo = 2500.33; // 2.5 é igual a 2,5 e não 2.500,00

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // para tentar converter de short para inteiro é necessária a utilização da converção explícita

        System.out.println("numeroCurto2: " + numeroCurto2);

        // Exemplo da declaração de uma variável constante (seu valor não pode ser modificado)
        //final double VALOR_DE_PI = 3.14;
        
        //VALOR_DE_PI = 0; // erro ao tentar mudar o valor da constate
    }
}
