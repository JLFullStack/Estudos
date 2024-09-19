import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> aluno1 = new HashMap<>();

        aluno1.put("Nome", "Pedro");
        aluno1.put("Idade", "17");
        aluno1.put("Medio", "8.5");
        aluno1.put("Turma", "3a");

        System.out.println(aluno1);

        // retorna todas as chaves do aluno1
        System.out.println(aluno1.keySet());

        // verifica se o aluno1 contém a chave "Nome"
        System.out.println(aluno1.containsKey("Nome"));

        // cria uma lista de alunos
        List<Map<String, String>> alunos = new ArrayList<>();
        alunos.add(aluno1);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "15");
        aluno2.put("Medio", "9.0");
        aluno2.put("Turma", "3a");

        alunos.add(aluno2);

        System.out.println(alunos);
    }
}
