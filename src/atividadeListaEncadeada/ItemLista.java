package atividadeListaEncadeada;

public class ItemLista {
    String nome;
    int codigo;
    ItemLista proximo;

    public ItemLista(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.proximo = null;
    }

}
