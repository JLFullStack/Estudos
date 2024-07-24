package one.digitalinnovation;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T>
            primeiroNo,
            ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public int size(){
        return this.tamanhoLista;
    }

    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoPosterior(null);
        novoNo.setNoAnterior(ultimoNo);

        if (primeiroNo == null)
            primeiroNo = novoNo;

        if (ultimoNo != null)
            ultimoNo.setNoPosterior(novoNo);

        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento){
        NoDuplo<T>
            noAuxiliar = getNo(index),
            novoNo = new NoDuplo<>(elemento);

        novoNo.setNoPosterior(noAuxiliar);

        if (novoNo.getNoPosterior() != null){
            novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
            novoNo.getNoPosterior().setNoAnterior(novoNo);
        }
        else{
            novoNo.setNoAnterior(ultimoNo);
            ultimoNo = novoNo;
        }

        if(index == 0)
            primeiroNo = novoNo;
        else
            novoNo.getNoAnterior().setNoPosterior(novoNo);

        tamanhoLista++;
    }

    public void remove(int index) {
        if(index == 0) {
            primeiroNo = primeiroNo.getNoPosterior();

            if (primeiroNo != null)
                primeiroNo.setNoAnterior(null);
        }
        else {
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoAnterior().setNoPosterior(noAuxiliar.getNoPosterior());

            if (noAuxiliar != ultimoNo)
                noAuxiliar.getNoPosterior().setNoAnterior(noAuxiliar.getNoAnterior());
            else
                ultimoNo = noAuxiliar;
        }
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    //#region Métodos internos
    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;

        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoPosterior();
        }

        return noAuxiliar;
    }
    //#endregion

    public String toString() {
        String strRetorno = "";
        NoDuplo<T> noAuxiliar = primeiroNo;

        for(int i = 0; i < size(); i++){
            if (noAuxiliar != null) {
                strRetorno += "[No{conteudo= " + noAuxiliar.getConteudo() + "}]---> ";
                noAuxiliar = noAuxiliar.getNoPosterior();
            }
         }

        return strRetorno += "null\n";
    }
}
