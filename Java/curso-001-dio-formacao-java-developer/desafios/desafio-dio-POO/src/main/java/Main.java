import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava1 = new Curso("curso java 1", "descrição curso java 1", 8);
        Curso cursoJava2 = new Curso("curso java 2", "descrição curso java 2", 5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoJava1);
        bootcamp.getConteudos().add(cursoJava2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreveBootcamp(bootcamp);

        System.out.println("\n" +devCamila.getNome() +": ");
        System.out.println("\tConteúdos incritos: " +devCamila.getConteudosInscritos());
        System.out.println("\tConteúdos concluídos: "+ devCamila.getConteudosConcluidos());

        devCamila.progredir();
        devCamila.progredir();
        System.out.println("\n\tConteúdos incritos: " + devCamila.getConteudosInscritos());
        System.out.println("\tConteúdos concluídos: " + devCamila.getConteudosConcluidos());
        System.out.println("\tXP: " +devCamila.calculaXp());

        System.out.println("\n\t-------------------------------------------\n");
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreveBootcamp(bootcamp);

        System.out.println("\n" +devJoao.getNome() +": ");
        System.out.println("\tConteúdos incritos: " + devJoao.getConteudosInscritos());
        System.out.println("\tConteúdos concluídos: " + devJoao.getConteudosConcluidos());

        devJoao.progredir();
        System.out.println("\n\tConteúdos incritos: " + devJoao.getConteudosInscritos());
        System.out.println("\tConteúdos concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("\tXP: " +devJoao.calculaXp());
    }
}
