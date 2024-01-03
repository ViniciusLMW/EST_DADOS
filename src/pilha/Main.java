package pilha;

import java.util.LinkedList;

public class Main {
    public static void main(String [] args) {
        LinkedList ll = new LinkedList();

        ll.push("A");
        ll.push("B");
        ll.push("C");
        ll.push("D");

        System.out.println(" === Acessando como Pilha === ");
        while (ll.size() > 0) {
            String val = (String) ll.pop();
            System.out.println(val);
        }
    }
}
