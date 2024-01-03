package pilha.cestaMercado;

import java.util.LinkedList;

public class Cesta {
    public static void main(String [] args) {
        LinkedList cestinha = new LinkedList();

        cestinha.push(new Produto ("Água", 4));
        Produto p = new Produto("Maçã 1KG", 8);
        cestinha.push(p);
        Object o = new Produto("Macarrão 500g", 6.5f);
        cestinha.push(o);
        cestinha.push(new Produto ("Leite 1L", 4.5f));

        System.out.println(" === Valor da cesta usando Pilha === ");
        float valorCompra = 0;
        while (cestinha.size() > 0) {
            Produto val = (Produto) cestinha.pop();
            valorCompra += val.getPreco();
            System.out.println(val);
        }
        
        System.out.println("O valor total da compra é de: R$" + valorCompra);
    }
}
