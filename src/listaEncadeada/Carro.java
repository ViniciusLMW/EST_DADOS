package listaEncadeada;

public class Carro {
    String nome;
    float cilindradas;
    float cavalos;
    float peso;
    Carro proximo;

    public Carro(String nome, float cilindradas, float cavalos, float peso) {
        super();
        this.nome = nome;
        this.cilindradas = cilindradas;
        this.cavalos = cavalos;
        this.peso = peso;
    }


    
    @Override
    public String toString() {
        return "Carro [nome=" + nome + ", cilindradas=" + cilindradas + ", cavalos=" + cavalos + ", peso=" + peso + ", proximo=" + proximo + "]";
    }



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(float cilindradas) {
        this.cilindradas = cilindradas;
    }
    public float getCavalos() {
        return cavalos;
    }
    public void setCavalos(float cavalos) {
        this.cavalos = cavalos;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public Carro getProximo() {
        return proximo;
    }
    public void setProximo(Carro proximo) {
        this.proximo = proximo;
    }

    
}
