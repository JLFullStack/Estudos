package one.digitalinnovation.equalshashcode;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // region trabalhando com equals e hashcode
        System.out.println("\n trabalhando com equals e hashcode");

        List<Carro> carrosList = new ArrayList<>();

        carrosList.add(new Carro("Ford"));
        carrosList.add(new Carro("Chevrolet"));
        carrosList.add(new Carro("Volkswagen"));

        System.out.println(carrosList.contains(new Carro("Ford")));

        // retorna o hashCode do objeto
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford1").hashCode());

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Ford");
        Carro carro3 = new Carro("Chevrolet");

        // verifica se os objetos são iguais
        System.out.println("\n" + carro1.equals(carro2));
        System.out.println(carro1.equals(carro3));
        System.out.println("-------------------------------------------------------------------------- \n");
        // endregion

        // region trabalhando com stack/pilhas
        System.out.println("\n trabalhando com stack/pilhas");

        Stack<Carro> carrosStack = new Stack<>();

        carrosStack.push(carro1);
        carrosStack.push(carro2);
        carrosStack.push(carro3);
        carrosStack.push(new Carro("Fiat"));

        // "pop()" retira o objeto do topo da pilha
        System.out.println("\n" + carrosStack);
        System.out.println(carrosStack.pop());
        System.out.println(carrosStack);

        // "peek()" exibe o objeto do topo da pilha
        System.out.println("\n" + carrosStack.peek());
        System.out.println(carrosStack);

        // "empty()" verifica se a pilha está vazia
        if (carrosStack.empty())
            System.out.println("\nPilha vazia!");
        else
            System.out.println("\nObjetos da pilha: " + carrosStack);

        System.out.println("-------------------------------------------------------------------------- \n");
        // endregion

        //#region trabalhando com Queue(Fila, LikedList)
        System.out.println("trabalhando com Queue(Fila, LikedList)");

        Queue<Carro> carrosQueue = new LinkedList<>();

        carrosQueue.add(carro1);
        carrosQueue.add(carro2);
        carrosQueue.add(carro3);

        System.out.println("\n" + carrosQueue.add(new Carro("Peugeot")));
        System.out.println(carrosQueue);

        System.out.println("\n" + carrosQueue.offer(new Carro("Renault")));
        System.out.println(carrosQueue);

        // pega o primeiro carro da fila
        System.out.println("\n" + carrosQueue.peek());
        System.out.println(carrosQueue);

        // pega o primeiro carro da fila e o remove
        System.out.println("\n" + carrosQueue.poll());
        System.out.println(carrosQueue);

        // verifica se a fila está vazia
        System.out.println("\n" + carrosQueue.isEmpty());

        // retorna o tamanho da fila
        System.out.println(carrosQueue.size());

        System.out.println("-------------------------------------------------------------------------- \n");
        //#endregion

        //#region trabalhando com List(ArrayList)
        System.out.println("trabalhando com List(ArrayList)");

        List<Carro> carroList = new ArrayList<>();

        carroList.add(carro1);
        carroList.add(new Carro("Fiat"));
        carroList.add(carro3);

        System.out.println("\n" + carroList);

        System.out.println("\n" + carroList.contains(new Carro("Ford")));
        System.out.println(carroList.get(2));
        System.out.println(carroList.indexOf(new Carro("Fiat")));

        carroList.remove(2);
        System.out.println("\n" + carroList);

        System.out.println("-------------------------------------------------------------------------- \n");
        //#endregion

        //#region trabalhando com Set(HashSet)
        System.out.println("trabalhando com Set(HashSet)");

        Set<Carro> carroSet = new HashSet<>();

        carroSet.add(new Carro("Fiat"));
        carroSet.add(new Carro("Chevrolet"));
        carroSet.add(new Carro("peugeot"));

        System.out.println("\n" + carroSet);

        // ordena os objetos conforme comparação implementada no compareTo
        Set<Carro> carroTreeSet = new TreeSet<>();

        carroTreeSet.add(new Carro("Fiat"));
        carroTreeSet.add(new Carro("Chevrolet"));
        carroTreeSet.add(new Carro("Peugeot"));

        System.out.println("\n" + carroTreeSet);

        System.out.println("-------------------------------------------------------------------------- \n");
        //#endregion
    }
}
