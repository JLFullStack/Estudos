package com.projetono;

public class No<T> {
    private T conteudo;
    private No<T> poximoNo;

    public No(T conteudo) {
        this.poximoNo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getPoximoNo() {
        return poximoNo;
    }

    public void setPoximoNo(No<T> poximoNo) {
        this.poximoNo = poximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
