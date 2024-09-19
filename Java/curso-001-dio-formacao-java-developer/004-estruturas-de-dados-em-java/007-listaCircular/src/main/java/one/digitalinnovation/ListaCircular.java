package one.digitalinnovation;

public class ListaCircular<T> {
    private No<T>
        cabeca,
        cauda;

    private int tamanhoLista;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);

        if(this.isEmpty()){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoPosterior(this.cauda);
        }
        else {
            novoNo.setNoPosterior(this.cauda);
            this.cabeca.setNoPosterior(novoNo);
            this.cauda = novoNo;
        }

        this.tamanhoLista++;
    }

    public void remove(int index){
        if (index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista");

        No<T> noAuxiliar = this.cauda;

        if (index == 0) {
            this.cauda = this.cauda.getNoPosterior();
            this.cabeca.setNoPosterior(this.cauda);
        }
        else if (index == 1) {
            this.cauda.setNoPosterior(this.cauda.getNoPosterior().getNoPosterior());
        }
        else {
            for (int i = 0; i < index - 1; i++)
                noAuxiliar = noAuxiliar.getNoPosterior();

            noAuxiliar.setNoPosterior(noAuxiliar.getNoPosterior().getNoPosterior());
        }

        this.tamanhoLista--;
    }

    public boolean  isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        No<T> noAuxiliar = this.cauda;

        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No{conteudo= " + noAuxiliar.getConteudo() + "}]----> ";
            noAuxiliar = noAuxiliar.getNoPosterior();

        }

        strRetorno += this.isEmpty() ? "Lista vazia\n" : "Retorna ao início\n";

        return strRetorno;
    }

    //#region Métodos privados
    private No<T> getNo(int index) {
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia!");

        if (index == 0)
            return this.cauda;

        No<T> noAuxiliar = this.cauda;

        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getNoPosterior();
        }

        return noAuxiliar;
    }
    //#endregion
}
