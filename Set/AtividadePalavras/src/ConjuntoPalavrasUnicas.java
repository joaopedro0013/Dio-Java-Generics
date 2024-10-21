
import java.util.Set;
import java.util.HashSet;

public class ConjuntoPalavrasUnicas {

    private Set<Palavras>  conjuntoPalavras;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        conjuntoPalavras.add( new Palavras(palavra));
    }

    public void removerPalavra(String palavra){
        for (int i = 0; i < conjuntoPalavras.size(); i++) {
            conjuntoPalavras.removeIf(p ->p.getPalavra().equals(palavra));
        }   
    }

    public boolean verificarPalavra(String palavra) {
        return conjuntoPalavras.contains(palavra);
    }


    public void exibirPalavrasUnicas(){
        if (conjuntoPalavras.isEmpty()) {
                System.out.println("Não tem nenhuma palavra"); 
        }else{
            System.out.println(conjuntoPalavras);
        }
    }


    public static void main(String[] args) throws Exception {
        ConjuntoPalavrasUnicas Linguagens = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        Linguagens.adicionarPalavra("Java");
        Linguagens.adicionarPalavra("Python");
        Linguagens.adicionarPalavra("JavaScript");
        Linguagens.adicionarPalavra("Python");
        Linguagens.adicionarPalavra("C++");
        Linguagens.adicionarPalavra("Ruby");
    
        // Exibindo as linguagens únicas no conjunto
        Linguagens.exibirPalavrasUnicas();
    
        // Removendo uma linguagem do conjunto
        Linguagens.removerPalavra("Python");
        Linguagens.exibirPalavrasUnicas();
    
        // Removendo uma linguagem inexistente
        Linguagens.removerPalavra("Swift");
    
        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + Linguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + Linguagens.verificarPalavra("Python"));
    
        // Exibindo as linguagens únicas atualizadas no conjunto
        Linguagens.exibirPalavrasUnicas();
    }
}
