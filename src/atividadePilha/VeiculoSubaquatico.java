package atividadePilha;

import java.util.LinkedList;

public class VeiculoSubaquatico {
    private LinkedList pessoas;
    private double pesoAtual;

    public VeiculoSubaquatico() {
        pessoas = new LinkedList();
        pesoAtual = 0;
    }
    
    public void adicionarPessoa(String nome, double peso) {
        if(pesoAtual + peso <= 480 && pessoas.size() < 6) {
            Pessoa pessoa = new Pessoa(nome, peso);
            pessoas.add(pessoa); //.addLast
            pesoAtual += peso;
            System.out.println("Passageiro " + nome + " adicionado ao veículo.");
        }else {
            System.out.println("Veículo cheio ou excesso de peso. Passageiro não pode entrar.");
        }
    }

    public void desembarcarPessoa() {
        System.out.println(" === Desembarcar Passageiros ===");
        while(pessoas.size() > 0) {
            Pessoa pessoa = (Pessoa) pessoas.pop(); //.removeLast
            System.out.println("Passageiro " + pessoa.getNome() + " Saiu do veículo.");
        }
    }

    public void exibirSituacao() {
        System.out.println("========================="); 
        System.out.println(" === Situação Atual do Veículo ===");
        System.out.println("Passageiros a bordo: ");
        for(Object pessoa : pessoas) {
            System.out.println(pessoa);
        }
        System.out.println("Peso atual: " + pesoAtual + " kg.");
    }
}
