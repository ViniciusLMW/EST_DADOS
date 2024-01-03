package atividadeListaEncadeada;

public class Fila {
    private ItemLista primeiro;
    private ItemLista ultimo;

    public void exibirFila() {
        ItemLista atual = primeiro;
        System.out.println("");
        System.out.println("Lista:");
        while(atual != null) {
            System.out.println("Nome: " + atual.nome);
            System.out.println("Código: " + atual.codigo);
            System.out.println("");
            atual = atual.proximo;
        }
    }

    public void incluirNaFila(String nome, int codigo) {
        ItemLista novoItem = new ItemLista(nome, codigo);
        if(primeiro == null) {
            primeiro = novoItem;
            ultimo = novoItem;
        } else {
            ultimo.proximo = novoItem;
            ultimo = novoItem;
        }
    }

    public void removerDaFila() {
        if(primeiro == null) {
            System.out.println("=========================");
            System.out.println("Não possui itens para remover.");
            return;
        }
        ItemLista temp = primeiro;
        primeiro = primeiro.proximo;
        temp.proximo = null;

        System.out.println("=========================");
        System.out.println("Item removido da fila:");
        System.out.println("Nome: " + temp.nome);
        System.out.println("Código: " + temp.codigo);
    }
}