import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Dicionario {
 private Map<String, String>  ListaDicionario;

    String palavra;
    String desfinicao;
 

    public Dicionario() {
        this.ListaDicionario = new HashMap<>();
    }


    public void adicionarPalavra(String palavra, String desfinicao){
        ListaDicionario.put(palavra, desfinicao);
    }

    public void removerPalavra(String palavra){
        ListaDicionario.remove(palavra);
    }

    public void exibirPalavras(){
        System.out.println(ListaDicionario);
    }

    public String pesquisarPorPalavra(String palavra){
        String descricaoNome = null;
        if (!ListaDicionario.isEmpty()) {
            descricaoNome = ListaDicionario.get(palavra);
          if (descricaoNome == null) {
            System.out.println("Palavra nao tem descricao");
          }
        } else {
          System.out.println("O dicionario está vazio.");
        }
        return descricaoNome;
    }

    public static void main(String[] args) throws Exception {

        Dicionario ListaDicionario = new Dicionario();


        ListaDicionario.adicionarPalavra("Giga Chad","Quando alguem faz alguma coisa muito incrivel de um geito muito impresionante");
        ListaDicionario.adicionarPalavra("Não binario", "Coisa de gente esquisita");
        ListaDicionario.exibirPalavras();

        ListaDicionario.pesquisarPorPalavra("Giga Chad");

        ListaDicionario.removerPalavra("Não binario");


        ListaDicionario.exibirPalavras();

        System.out.println("Hello, World!");
    }


    public Map<String, String> getListaDicionario() {
        return ListaDicionario;
    }


    public void setListaDicionario(Map<String, String> listaDicionario) {
        ListaDicionario = listaDicionario;
    }


    public String getPalavra() {
        return palavra;
    }


    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }


    public String getDesfinicao() {
        return desfinicao;
    }


    public void setDesfinicao(String desfinicao) {
        this.desfinicao = desfinicao;
    }
}
