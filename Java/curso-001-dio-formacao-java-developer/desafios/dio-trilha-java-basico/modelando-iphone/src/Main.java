public class Main {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        
        iphone.ligar("+555555555555");
        iphone.atender();
        iphone.inicarCorreioVoz("+555555555555");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("teste música");
        iphone.exibirPagina("www.teste.com");
        iphone.adicionarNovaAba();
        iphone.fecharAba();
        iphone.atualizarPagina();
    }
}
