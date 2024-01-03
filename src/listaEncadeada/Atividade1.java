package listaEncadeada;

import java.io.File;
import java.io.FileInputStream;

public class Atividade1 {
    public static void main(String[] args) {
        String textoDoArquivo = lerArquivo();
        System.out.println(textoDoArquivo);
        String[] linhas = textoDoArquivo.split("\n");

        Carro primeiro = null;
        Carro ultimo = null;
        //int i = 2 | porque os dados começa após a 2 linha no arquivo cars.csv
        for(int i = 2; i < linhas.length; i++) {
            String linha = linhas[i];
            String[] colunas = linha.split(";");
            //int cols = colunas.length;

            String nome = colunas[0];
            float peso = Float.valueOf(colunas[5]);
            float cavalos = Float.valueOf(colunas[4]);
            float cilindros = Float.valueOf(colunas[2]);
            Carro c = new Carro(nome, cilindros, cavalos, peso);
            if(primeiro == null) {
                primeiro = c;
            }
            if(ultimo == null) {
                ultimo = c;
            } else {
                ultimo.proximo = c;
                ultimo = c;
            }
            c.proximo = null;
        }
        imprimeListaCarros(primeiro);
    }

    public static void imprimeListaCarros(Carro primeiro) {
            Carro proximo = primeiro;
            int nLinha = 1;
            while(proximo != null) {
                System.out.println(nLinha + ". ");
                System.out.println(proximo);
                proximo = proximo.getProximo();
                nLinha++;
            }
        }
    
    public static String lerArquivo() {
        String conteudo = new String("");
        File f = new File("D:\\2 FASE\\Estrutura de Dados\\cars.csv");
        try {
            FileInputStream fis = new FileInputStream(f);
            byte[] conteudoArquivo = new byte[fis.available()];
            fis.read(conteudoArquivo);
            conteudo = new String(conteudoArquivo);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return conteudo;
    }

 

}
