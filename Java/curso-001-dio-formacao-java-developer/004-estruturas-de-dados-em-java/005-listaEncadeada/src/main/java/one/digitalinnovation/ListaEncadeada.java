package one.digitalinnovation;

public class ListaEncadeada<T> {
    No<T> referenciaEntradaNo;

    public ListaEncadeada() {
        this.referenciaEntradaNo = null;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);

        if (this.isEmpty()) {
            referenciaEntradaNo = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntradaNo;

        for(int i = 0; i < this.size()-1; i++)
            noAuxiliar = noAuxiliar.getProximoNo();

        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    public T remove(int index) {
        No<T> noPivor = getNo(index);

        if(index == 0) {
            referenciaEntradaNo = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }

        No<T> noAnterior = getNo(index-1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAuxiliar = referenciaEntradaNo;

        while(referenciaAuxiliar != null){
            tamanhoLista++;

            if (referenciaAuxiliar.getProximoNo() != null)
                referenciaAuxiliar = referenciaAuxiliar.getProximoNo();
            else
                break;
        }

        return tamanhoLista;
    }

    public boolean isEmpty() {
        return referenciaEntradaNo == null ? true : false;
    }

    public String toString() {
        String str = "\n";
        No<T> noAuxiliar = referenciaEntradaNo;

        for(int i = 0; i < this.size()-1; i++){
            str += "[No{conteúdo=" + noAuxiliar.getConteudo() + "}]---> ";
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return str += noAuxiliar;
    }

    //#region Métodos privados
    private No<T> getNo(int index) {
        validaIndice(index);

        No<T>
            noAuxiliar = referenciaEntradaNo,
            noRetorno = null;

        for(int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    private void validaIndice(int index){
        if (index < 0 || index >= this.size()) {
            int ultimoIndice = this.size() - 1;

            throw new IndexOutOfBoundsException("O indice: " + index + " não faz parte desta lista. " +
                    "\n Tamanho da lista: " + ultimoIndice);
        }
    }
    //#endregion
}
