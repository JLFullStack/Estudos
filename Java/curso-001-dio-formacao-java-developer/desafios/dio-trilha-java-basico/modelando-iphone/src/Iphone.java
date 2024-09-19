import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    public void atender() {
        System.out.println("Atendendo o telefone");
    }

    public void inicarCorreioVoz(String numero) {
        System.out.println("Iniciando correio de voz com o número: " + numero);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    public void pausar() {
        System.out.println("Pausando a música");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    public void tocar() {
        System.out.println("Tocando a música");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    public void fecharAba() {
        System.out.println("Fechando a aba");
    }
}