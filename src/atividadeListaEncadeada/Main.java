package atividadeListaEncadeada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Fila fila = new Fila();

    while(true) {
        System.out.println("=========================");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Exibir a fila");
        System.out.println("2 - Incluir item na fila");
        System.out.println("3 - Remover item da fila");
        System.out.println("4 - Sair");
        System.out.println("=========================");

        System.out.print("Sua opção: ");
        int escolha = input.nextInt();
        input.nextLine();

        switch(escolha) {
            case 1: {
                fila.exibirFila();
                break;
            }
            case 2: {
                System.out.print("Informe o nome do item: ");
                String nome = input.nextLine();
                System.out.print("Informe o código do item: ");
                int codigo = input.nextInt();

                fila.incluirNaFila(nome, codigo);
                System.out.println("=========================");
                System.out.println("Item adicionado na fila!");
                break;
            }
            case 3: {
                fila.removerDaFila();
                break;
            }
            case 4: {
                System.out.println("=========================");
                System.out.println("Saindo do programa...");
                System.exit(0);
                break;
            }
            default: {
                System.out.println("=========================");
                System.out.println("Opção inválida. Tente novamente");
                break;
            }
        }
        input.close();
    }
    }
}
