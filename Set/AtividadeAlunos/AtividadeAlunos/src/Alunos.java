public class Alunos {
    String  Aluno;
    int     matricula;
    double     nota;
    public Alunos(String aluno, int matricula, double nota) {
        Aluno = aluno;
        this.matricula = matricula;
        this.nota = nota;
    }
    public String getAluno() {
        return Aluno;
    }
    public void setAluno(String aluno) {
        Aluno = aluno;
    }
    public int getmatricula() {
        return matricula;
    }
    public void setmatricula(int matricula) {
        this.matricula = matricula;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    @Override
    public String toString() {
        return "Aluno=" + Aluno + ", matricula=" + matricula + ", nota=" + nota + "/";
    }



    
}
