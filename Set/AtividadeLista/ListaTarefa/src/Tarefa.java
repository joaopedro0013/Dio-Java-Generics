public class Tarefa {

    private String descricao;
    private boolean atividadeFeita;

    
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAtividadeFeita() {
        return atividadeFeita;
    }

    public void setAtividadeFeita(boolean atividadeFeita) {
        this.atividadeFeita = atividadeFeita;
    }

    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + ", atividadeFeita=" + atividadeFeita + "]";
    }

}
