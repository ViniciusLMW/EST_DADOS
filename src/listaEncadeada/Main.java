package listaEncadeada;

//import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		 System.out.println("Estrutura de dados");
	        ItemListaEncadeada primeiro = null;
	        ItemListaEncadeada ultimo = null;
	        imprimeListaEncadeada(primeiro);
	        //1 primeiro elemento
			int x = 100;
	        ItemListaEncadeada item = new ItemListaEncadeada();
	        item.valor = x;
	        item.proximo = null;
			ItemListaEncadeada item2 = item;
			//item.proximo = item2;
			x= 115;
	        primeiro = item;
	        ultimo = item;
	        imprimeListaEncadeada(primeiro);

	        //segundo elemento
	        item = new ItemListaEncadeada();
	        item.valor = 85;
	        item.proximo = null;
	        ultimo.proximo = item;
	        ultimo = item;
	        imprimeListaEncadeada(primeiro);
	        /*
	        int[] lista = new int[0];
	        lista = add(lista, 16);
	        lista = add(lista, 1000);
	        
	        ArrayList lista2 = new ArrayList(); 
	        lista2.add(16);
	        lista2.add(1000);
	        */
	        
	    }
	    
	    public static void imprimeListaEncadeada(ItemListaEncadeada primeiro) {
	        ItemListaEncadeada proximo = primeiro;
	        System.out.println("Imprimindo lista...");
	        while(proximo != null) {
	            System.out.println(proximo.valor);
	            proximo = proximo.proximo;
	        }
	    }
	    
	    
	    public static class ItemListaEncadeada{
	        int valor = 0;
	        ItemListaEncadeada proximo = null;
	    }
	    
	    
	    public static int[] add(int[] lista, int novoValor) {
	        int[] novaLista = new int[lista.length+1];
	        for(int i=0; i< lista.length; i++) {
	            novaLista[i] = lista[i];
	        }
	        novaLista[lista.length] = novoValor;
	        return novaLista;
	    }
	}