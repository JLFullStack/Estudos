package one.digitalinovation;

public class Pilha {
    private No referenciaEntrada;

    public Pilha(){
        this.referenciaEntrada = null;
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    public No top(){
        return referenciaEntrada;
    }

    public void push(No novoNo){
        No referenciaAuxiliar = referenciaEntrada;
        referenciaEntrada = novoNo;
        referenciaEntrada.setReferenciaNo(referenciaAuxiliar);
    }

    public No pop(){
        if (!isEmpty()){
            No referenciaAuxiliar = referenciaEntrada;
            referenciaEntrada = referenciaEntrada.getReferenciaNo();
            return referenciaAuxiliar;
        }
        else return null;
    }

    public String toString(){
        String retorno = "-----------\n";
        retorno += "    Pilha\n";
        retorno += "-----------\n";

        No noAuxiliar = referenciaEntrada;

        while (noAuxiliar != null) {
            retorno += "[No{dado= " + noAuxiliar.getDado() + "}]\n";
            noAuxiliar = noAuxiliar.getReferenciaNo();
        }

        retorno += "-----------\n";

        return retorno;
    }
}
