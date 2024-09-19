public class EstruturasDeRepeticao {
    public static void main(String[] args) throws Exception {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};
        
        // For Each em java, forma abreviada da estrutura for
        for(String aluno : alunos) {
            System.out.println("Nome do aluno: " + aluno);
        }
    }
}