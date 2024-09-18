import java.util.*;

public class MetodoList {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        // 1 - crie uma lista e adicione as sete notas:
        List<Double> notas = new ArrayList<>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println("notas: " +notas);

        // 2 - Exiba a posição da nota 5.0:
        System.out.println("posição da nota 5.0: " +notas.indexOf(5d));

        // 3 - Adicione na lista a nota 8.0 na posição 4:
        notas.add(4, 8.0);
        System.out.println("nota 8.0 adicionada na posição 4: " +notas);

        // 3 - Substitua a nota 5.0 pela nota 6.0:
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println("nota 5.0 substituída pela nota 6.0: " +notas);

        // 3 - Confira se a nota 5.0 está na lista:
        System.out.println("verificando se a nota 5.0 está na lista: " +notas.contains(5d));

        // 4 - Exiba a terceira nota adicionada:
        System.out.println("terceira nota adicionada: " +notas.get(2));

        // 5 - Exiba a menor nota:
        System.out.println("menor nota: " +Collections.min(notas));

        // 6 - Exiba a maior nota:
        System.out.println("maior nota: " +Collections.max(notas));

        // 7 - Exiba a soma dos valores:
        //Double soma = notas.stream().mapToDouble(Double::doubleValue).sum();
        //System.out.println("soma dos valores: " +soma);

        double soma = 0d;
        //Iterator<Double> iterator = notas.iterator();

        //while (iterator.hasNext()) {
            //soma += iterator.next();
        //}

        for (double nota : notas)
            soma += nota;

        System.out.println("soma dos valores: " + soma);

        // 8 - Exiba a média das notas:
        double media = soma / notas.size();
        System.out.println("média: " + media);

        // 8 - Remova a nota 0.0:
        notas.remove(0d);
        System.out.println("nota 0.0 removida: " + notas);

        // 8 - Remova a nota na posição 0:
        notas.remove(0);
        System.out.println("nota na posição 0 removida: " + notas);

        // Remova as notas menores que 7:
        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()){
            Double next = iterator.next();
            if(next < 7) iterator.remove();
        }
        System.out.println("notas menores que 7 removidas: " + notas);

        // apague toda a lista;
        notas.clear();
        System.out.println("lista de notas apagada: " + notas);

        // confira se a lista está vazia:
        System.out.println("conferindo se a lista está vazia: " + notas.isEmpty());
    }
}
