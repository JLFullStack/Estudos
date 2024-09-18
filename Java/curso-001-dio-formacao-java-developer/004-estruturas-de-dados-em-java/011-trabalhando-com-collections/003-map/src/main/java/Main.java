import java.util.*;

public class Main {
    public static void main(String[] args) {
        //#region Dada os modelos deos carros e seus respectivos consumos na estrada, faça:


        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println("\nCrie um dicionário que relacione os modelos e seus respectivos consumos: " +carrosPopulares);

        carrosPopulares.replace("gol", 15.2);
        System.out.println("Substitua o consumo do gol por 15,2 km/l: " +carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionário: " +carrosPopulares.containsKey("tucson"));
        System.out.println("Exiba o consumo do uno: " +carrosPopulares.get("uno"));
        System.out.println("Exiba os modelos:" +carrosPopulares.keySet());
        System.out.println("Exiba os consumos dos modelos: " +carrosPopulares.values());

        System.out.println("\nExiba os modelos mais econômicos e seus consumos: ");
        Double menorConsumo = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        for (Map.Entry<String, Double> entry: entries){
            if (entry.getValue().equals(menorConsumo)) {
                System.out.println("modelo mais econômico: " +entry);
            }
        }

        System.out.println("\nExiba os modelos menos econômicos e seus consumos: ");
        Double maiorConsumo = Collections.min(carrosPopulares.values());
        for (Map.Entry<String, Double> entry: entries){
            if (entry.getValue().equals(maiorConsumo)) {
                System.out.println("modelo menos econômico: " +entry);
            }
        }

        Collection<Double> consumos = carrosPopulares.values();
        double somaConsumo = 0.0;
        for(double consumo: consumos)
            somaConsumo += consumo;

        System.out.println("\nExiba a soma dos consumos: " +somaConsumo);
        System.out.println("Exiba a média dos consumos: " +somaConsumo/carrosPopulares.size());

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        while(iterator.hasNext()){
            Double consumo = iterator.next();

            if (consumo.equals(15.6))
                iterator.remove();
        }
        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: " +carrosPopulares);

        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println("Exiba todos os carros na ordem em que foram informados: " +carrosPopulares2);

        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares);
        System.out.println("Exiba o dicionário ordenado pelo modelo: " +carrosPopulares3);

        carrosPopulares.clear();
        System.out.println("Apague o dicionário de carros: " +carrosPopulares);

        System.out.println("Confira se o dicionário está vazio: " +carrosPopulares.isEmpty());
        System.out.println("\t\t------------------------------------------------------\t\t\n\n");
        //#endregion

        //#region Ordenação - Dadas as seguintes informações sobre meus livros favoritos e seus autores, faça:
        // Crie um dicionário e o ordene

        List<Autor> autoresLivro1 = new ArrayList<>(){{
            add(new Autor("hawking"));
            add(new Autor("Stephen"));
        }};

        List<Autor> autoresLivro2 = new ArrayList<>(){{
            add(new Autor("duhing"));
            add(new Autor("Charles"));
        }};

        List<Autor> autoresLivro3 = new ArrayList<>(){{
            add(new Autor("Horari"));
            add(new Autor("Vuval Nooh"));
        }};

        System.out.println("\nOrdem aleatória: ");
        Map<List<Autor>, Livro> livros1 = new HashMap<>(){{
            put(autoresLivro1, new Livro("Uma breve história do tempo", autoresLivro1, 256));
            put(autoresLivro2, new Livro("O poder do hábito", autoresLivro2, 408));
            put(autoresLivro3, new Livro("21 lições para o século 21", autoresLivro3, 432));
        }};

        for(Map.Entry<List<Autor>, Livro> livro: livros1.entrySet())
            System.out.println("Autores: " +livro.getKey() + "\tTítulo: " + livro.getValue().getTitulo());

        System.out.println("\nOrdem de inserção: ");
        Map<List<Autor>, Livro> livros2 = new LinkedHashMap<>(){{
            put(autoresLivro1, new Livro("Uma breve história do tempo", autoresLivro1, 256));
            put(autoresLivro2, new Livro("O poder do hábito", autoresLivro2, 408));
            put(autoresLivro3, new Livro("21 lições para o século 21", autoresLivro3, 432));
        }};

        for(Map.Entry<List<Autor>, Livro> livro: livros2.entrySet())
            System.out.println("Autores: " +livro.getKey() + "\tTítulo: " + livro.getValue().getTitulo());

        //#endregion
    }
}
