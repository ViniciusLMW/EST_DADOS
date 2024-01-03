package estruturaDados;

public class Main {

private static int[] lista = {56,87,90,61,1,12,103,6,89,15};
private static int valorPesquisado = 15;

public static void main(String[] args) {

    ordencaoBolha(lista);
    for(int i=0; i< lista.length; i++) 
        System.out.print(lista[i]+",");
        int indice = buscaBinaria(lista, valorPesquisado);
        System.out.println("Indice:"+ indice);
    }

public static void ordencaoBolha(int[] lista) {
    boolean estaOrdenado = false;
    while(!estaOrdenado) {
        estaOrdenado = true;
        for(int i = 0; i < lista.length-1; i++) {
            if(lista[i]>lista[i+1]) {
                int temp = lista[i];
                lista[i] = lista[i+1];
                lista[i+1] = temp;
                estaOrdenado = false;
            }
        }
    }
}
/**
* Esta função serve para pesquisar elementos em tempo log(n)
* @param lista repositório dos dados
* @param valorPesquisado valor que se está buscando
* @return indice do elemento pesquisado ou -1 quando não encontrado
*/
public static int buscaBinaria(int[] lista, int valorPesquisado) {
    int inicio =0;
    int fim = lista.length -1;
    int meio = (fim+inicio)/2;
    boolean encontrou = false;
    while(!encontrou && fim >= inicio) {
        if(lista[meio] == valorPesquisado) {
            encontrou = true;
        }else if(lista[meio] > valorPesquisado) {
            fim = meio-1;
        }else {
            inicio = meio+1;
        }
    meio = (fim+inicio)/2;
    } 
return encontrou ? meio : -1;
}
}
