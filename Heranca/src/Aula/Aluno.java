package Aula;

public class Aluno extends Pessoa{
    private String curso, semestre;

    public Aluno() {
        System.out.println("Executando construtor da classe Aluno");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}
