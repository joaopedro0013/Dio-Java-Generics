import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

     private Map<String, Integer>  ListaPalavras;

    String palavra;
    Integer contagem;


    public ContagemPalavras() {
        this.ListaPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        ListaPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        ListaPalavras.remove(palavra);
    }

    public void exibirContagemPalavras(){
        System.out.println(ListaPalavras);
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;

        for (Map.Entry<String, Integer> entry : ListaPalavras.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }

        return palavraMaisFrequente + " : " + maiorContagem;
    }

    public static void main(String[] args) throws Exception {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Olá", 1);
        contagemPalavras.adicionarPalavra("tudo", 2);
        contagemPalavras.adicionarPalavra("bem?", 3);

        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.removerPalavra("tudo");

        contagemPalavras.adicionarPalavra("bem?", 4);

        contagemPalavras.exibirContagemPalavras();

        System.out.println("Palavra mais frequente: " + contagemPalavras.encontrarPalavraMaisFrequente());
    }
    

    @Override
    public String toString() {
        return "ContagemPalavras [ListaPalavras=" + ListaPalavras + ", palavra=" + palavra + ", contagem=" + contagem
                + "]";
    }
}
