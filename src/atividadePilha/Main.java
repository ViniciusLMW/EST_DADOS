package atividadePilha;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        VeiculoSubaquatico veiculo = new VeiculoSubaquatico();

        while(true) {
            System.out.println("=========================");
            System.out.println("Menu:");
            System.out.println("1 - Adicionar passageiro");
            System.out.println("2 - Desembarcar passageiros");
            System.out.println("3 - Exibir situação");
            System.out.println("4 - Sair");
            System.out.println("=========================");            
        
            System.out.print("Sua opção: ");
            int escolha = input.nextInt();
            input.nextLine();
            switch(escolha) {
                case 1: {
                    System.out.print("Nome passageiro: ");
                    String nome = input.nextLine();
                    System.out.print("Peso passageiro: ");
                    double peso = input.nextDouble();
                    veiculo.adicionarPessoa(nome, peso);
                    break;
                }
                case 2: {
                    veiculo.desembarcarPessoa();
                    break;
                }
                case 3: {
                    veiculo.exibirSituacao();
                    break;
                }
                case 4: {
                    System.out.println("Saindo do programa...");
                    input.close();
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
                }
            }
        }
    }
}
