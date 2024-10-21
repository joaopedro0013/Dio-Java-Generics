import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

     private Set<Alunos> listaAlunos;

    public GerenciadorAlunos() {
        this.listaAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double nota){
        listaAlunos.add(new Alunos(nome,matricula,nota));
    }

    public void removerAluno(int matricula){
        listaAlunos.removeIf(aluno -> aluno.getmatricula() == matricula);
    }

    public void exibirAlunosPorNome(){
        Set<Alunos> exibindoAlunosNomes = new TreeSet<>(Comparator.comparing(Alunos::getAluno));
        exibindoAlunosNomes.addAll(listaAlunos);
        for(Alunos e : listaAlunos){
            System.err.println(e.getAluno());
        }
    }

    public void exibirAlunosPorNota(){
        Set<Alunos> exibindoAlunosNotas = new TreeSet<>(Comparator.comparing(Alunos::getNota));
        exibindoAlunosNotas.addAll(listaAlunos);
        for(Alunos e : listaAlunos){
            System.err.println(e.getNota());
        }
    }

    public void exibirAlunos(){
        if (listaAlunos.isEmpty()) {
            System.out.println("Não tem nenhum aluno"); 
        }else{
            System.out.println(listaAlunos);
        }
    }


    public static void main(String[] args) throws Exception {

        GerenciadorAlunos listaAlunos = new GerenciadorAlunos();

        listaAlunos.adicionarAluno("Carlos",21800694,6.2);
        listaAlunos.adicionarAluno("João",21800693,8.2);

        listaAlunos.exibirAlunos();

        listaAlunos.adicionarAluno("Bernardo",21800695,9.2);

        listaAlunos.exibirAlunosPorNome();
        listaAlunos.exibirAlunosPorNota();

        listaAlunos.removerAluno(21800694);

        listaAlunos.exibirAlunos();
    }
}
