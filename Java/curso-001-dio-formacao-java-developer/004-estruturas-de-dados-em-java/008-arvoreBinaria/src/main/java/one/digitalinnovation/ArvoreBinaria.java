package one.digitalinnovation;

public class ArvoreBinaria<T extends Comparable<T>> {
    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(T conteudo) {
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    public void exibirInOrdem(){
        System.out.print("\n Exibindo InOrdem \n");
        exibirInOrdem(this.raiz);
    }

    public void exibirPosOrdem(){
        System.out.print("\n Exibindo PosOrdem \n");
        exibirPosOrdem(this.raiz);
    }

    public void exibirPreOrdem(){
        System.out.print("\n Exibindo PreOrdem \n");
        exibirPreOrdem(this.raiz);
    }

    public void remover(T conteudo) {
        try{
            BinNo<T>
                atual = this.raiz,
                pai = null,
                filho = null,
                temp = null;

            while (atual != null && atual.getConteudo().equals(conteudo)) {
                pai = atual;

                if (conteudo.compareTo(atual.getConteudo()) < 0)
                    atual = atual.getNoEsq();
                else
                    atual = atual.getNoDir();
            }

            if (atual == null)
                System.out.println("Conteúdo não encontrado.  Bloco Try");

            if (pai == null){
                if(atual.getNoDir() == null){
                    this.raiz = atual.getNoEsq();
                }
                else if(atual.getNoEsq() == null){
                    this.raiz = atual.getNoDir();
                }
                else{
                    for(temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoEsq()
                    ){
                        if(filho != atual.getNoEsq()){
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }

                    filho.setNoEsq(raiz.getNoDir());
                    raiz = filho;
                }
            }
            else if (atual.getNoDir() == null){
                if(pai.getNoEsq() == atual)
                    pai.setNoEsq(atual.getNoEsq());
                else
                    pai.setNoDir(atual.getNoEsq());
            }
            else if (atual.getNoEsq() == null){
                if(pai.getNoEsq() == atual)
                    pai.setNoEsq(atual.getNoDir());
                else
                    pai.setNoDir(atual.getNoDir());
            }
            else{
                for(temp = atual, filho = atual.getNoEsq();
                    filho.getNoDir() != null;
                    temp = filho, filho = filho.getNoDir()
                ){
                    if(filho != atual.getNoEsq()){
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }

                    filho.setNoDir(atual.getNoDir());

                    if(pai.getNoEsq() == atual)
                        pai.setNoEsq(filho);
                    else
                        pai.setNoDir(filho);
                }
            }
        }
        catch(NullPointerException erro){
            System.out.println("Conteúdo não encontrado.  Bloco Catch");
        }
    }

    //#region Métodos privados
    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {
        if (atual == null) {
            return novoNo;
        }
        else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        }
        else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }

        return atual;
    }

    private void exibirInOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    private void exibirPosOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo() + ", ");
        }
    }

    private void exibirPreOrdem(BinNo<T> atual) {
        if (atual != null) {
            System.out.print(atual.getConteudo() + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }
    //#endregion
}
