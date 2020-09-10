package heranca;

public class Professor extends Pessoa {
    
    private String especialidade;
    private double salario;

    public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        setEspecialidade(especialidade);
        setSalario(salario);

    }

    @Override
    public String toString() {
        System.out.println("Especialidade: " + this.especialidade + " Salário: " + this.salario);
        return super.toString();
    }



    public void receberAumento(int porcentagem) {
        
        setSalario(getSalario() * (porcentagem/100 + 1));

    }




    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }


    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getEspecialidade() {
        return especialidade;
    }



}
