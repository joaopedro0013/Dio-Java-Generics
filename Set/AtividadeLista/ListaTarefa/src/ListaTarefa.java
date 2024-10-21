import java.util.Set;
import java.util.HashSet;

public class ListaTarefa {

    private Set<Tarefa> listaTarefas;

    public ListaTarefa() {
        this.listaTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        for (int i = 0; i < listaTarefas.size(); i++) {
            listaTarefas.removeIf(p ->p.getDescricao().equals(descricao));
        }   
    }

    public void exibirTarefas(){
        if (listaTarefas.isEmpty()) {
                System.out.println("Não tem nenhuma palavra"); 
            }else{
                System.out.println(listaTarefas);
        }
    }


    public int  contarTarefas(){
        int total = 0;
            for (int i = 0; i < listaTarefas.size(); i++) {
                total += i;
            }
            return total; // Mova o return para fora do loop
       
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : listaTarefas) {
          if (t.isAtividadeFeita()) {
            tarefasConcluidas.add(t);
          }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa p : listaTarefas) {
          if (p.isAtividadeFeita()) {
            
          }else{
            tarefasPendentes.add(p);
          }
        }
        return tarefasPendentes;
    }


    public void marcarTarefaConcluida(String descricao){
        Set<Tarefa> marcartarefaConcluidas = new HashSet<>();
        for (Tarefa j : listaTarefas) {
            if (j.getDescricao().equals(descricao)) {
                j.setAtividadeFeita(true);
            }
          }

    }

    public void marcarTarefaPendente(String descricao){

        Tarefa tarefaParaMarcarComoPendente = null;

        for (Tarefa h : listaTarefas) {
            if (h.getDescricao().equals(descricao)) {
                h.setAtividadeFeita(false);
            }
        }
    
        if (tarefaParaMarcarComoPendente != null) {
          if(tarefaParaMarcarComoPendente.isAtividadeFeita()) {
            tarefaParaMarcarComoPendente.setAtividadeFeita(false);
          }
        } else {
          System.out.println("Tarefa não encontrada na lista.");
        }
    }


     public void limparListaTarefas(){
        if(listaTarefas.isEmpty()) {
            System.out.println("A lista já está vazia!");
          } else {
            listaTarefas.clear();
          }
     }

    public static void main(String[] args) throws Exception {
        ListaTarefa listaTarefas = new ListaTarefa();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
  
    }
}
