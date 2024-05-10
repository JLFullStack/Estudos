package anatomia_das_classes;

public class AnatomiaDasClasses {
    public static void main(String[] args) {
        // #region Anatomia das classes - 1
        // System.out.println("Olá Mundo!");
        // #endregion

        // #region Anatomia das classes - 2
        // "final": determina que este atributo recebe um valor que nunca poderá ser
        // modificado
        // final String BR = "Brasil";
        // #endregion

        // #region Anatomia das classes - 3
        String nome = "José Lucas",
                sobrenome = "Alcântara de Araújo";

        String nomeCompleto = nomeCompleto(nome, sobrenome);

        System.out.println("Nome Completo: ".concat(nomeCompleto));
        // #endregion
    }

    // #region Anatomia das classes - 3
    // "concat": método utilizado para concatenar strings
    public static String nomeCompleto(String nome, String sobrenome) {
        return nome.concat(" ").concat(sobrenome);
    }
    // #endregion
}
