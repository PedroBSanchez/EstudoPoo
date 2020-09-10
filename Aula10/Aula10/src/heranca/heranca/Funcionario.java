package heranca;

public class Funcionario extends Pessoa {
    
    private String setor;
    private boolean trabalhando;


    public Funcionario(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }


    public void mudarTrabalho() {
        setTrabalhando(!isTrabalhando());
    }



    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getSetor() {
        return setor;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    public boolean isTrabalhando() {
        return trabalhando;
    }
    



}
