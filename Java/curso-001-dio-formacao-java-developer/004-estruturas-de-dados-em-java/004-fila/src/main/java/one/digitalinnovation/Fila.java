package one.digitalinnovation;

public class Fila<T> {
    private No<T> referenciaEntrada;

    public Fila() {
        this.referenciaEntrada = null;
    }

    // adiciona um objeto ao final da fila
    public void enqueue(T object) {
        No<T> novoNo = new No<>(object);
        novoNo.setReferenciaNo(referenciaEntrada);
        referenciaEntrada = novoNo;
    }

    // consulta o primeiro objeto da fila
    public T first(){
        if (!this.isEmpty()){
            No<T> primeiroNo = referenciaEntrada;

            while(primeiroNo.getReferenciaNo() != null){
                primeiroNo = primeiroNo.getReferenciaNo();
            }
            return (T)primeiroNo.getObject();
        }
        return null;
    }

    // retira o primeiro objeto da fila
    public T dequeue(){
        if (!this.isEmpty()){
            No<T>
                primeiroNo = referenciaEntrada,
                noAuxiliar = referenciaEntrada;

            while(primeiroNo.getReferenciaNo() != null){
                noAuxiliar = primeiroNo;
                primeiroNo = primeiroNo.getReferenciaNo();
            }

            noAuxiliar.setReferenciaNo(null);
            return (T)primeiroNo.getObject();
        }
        return null;
    }

    public boolean isEmpty() {
        return referenciaEntrada == null ? true : false;
    }

    public String toString() {
        String retorno = "";
        No<T> noAuxiliar = referenciaEntrada;

        if (referenciaEntrada != null) {
            while (noAuxiliar.getReferenciaNo() != null) {
                retorno += "[{No{objeto= " +noAuxiliar.getObject() + "}]--->> ";
                noAuxiliar = noAuxiliar.getReferenciaNo();
            }

            retorno += "[{No{objeto= " +noAuxiliar.getObject() + "}]\n";
        }
        else {
            retorno = "null";
        }

        return retorno;
    }
}
