package heranca;

public class Aluno extends Pessoa{

    private boolean matricula;
    private String curso;

    public Aluno(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }


    public void cancelarMatricula() {
        setMatricula(false);
    }


    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }
    public boolean isMatricula() {
        return matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }



}
