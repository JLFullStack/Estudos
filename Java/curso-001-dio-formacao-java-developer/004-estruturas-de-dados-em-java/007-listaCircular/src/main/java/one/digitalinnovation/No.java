package one.digitalinnovation;

public class No<T> {
    private T conteudo;
    private No<T> noPosterior;

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.noPosterior = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getNoPosterior() {
        return noPosterior;
    }

    public void setNoPosterior(No<T> noPosterior) {
        this.noPosterior = noPosterior;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
