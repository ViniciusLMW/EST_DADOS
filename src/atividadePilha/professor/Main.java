package atividadePilha.professor;

public class Main {
    static final int PESO_MAXIMO = 480;
    static int ocupacaoAtual = 0;
    static Passageiro[] pilha = new Passageiro[6];
    public static void main(String [] args) {
        inserePassageiro("Leonardo", 100);
        inserePassageiro("André", 130);
        inserePassageiro("Julia", 150);
        listarPassageiros();
        inserePassageiro("Wesley", 50);
        listarPassageiros();
        System.out.println("================DESEMBARCANDO================");
        desembarque();
        listarPassageiros();
    }
    public static void inserePassageiro(String nome, double peso) {
        if(Main.ocupacaoAtual == Main.pilha.length || Main.cargaAtual() + peso > Main.PESO_MAXIMO) {
            return;
        }
        Passageiro p = new Passageiro(nome, peso);
        pilha[ocupacaoAtual] = p;
        ocupacaoAtual++;
    }
    public static void desembarque() {
        for(int i = ocupacaoAtual; i > 0; i--) {
            System.out.println(pilha[i - 1]);
            ocupacaoAtual--;
            pilha[i-1] = null;
        }
    }
    public static void listarPassageiros() {
        for(int i = ocupacaoAtual; i > 0; i--) {
            System.out.println(pilha[i - 1]);
        }
    }
    private static double cargaAtual() {
        double carga = 0;
        for(int i = ocupacaoAtual; i > 0; i--) {
            carga += pilha[i - 1].getPeso();
        }
        return carga;
    }
}
