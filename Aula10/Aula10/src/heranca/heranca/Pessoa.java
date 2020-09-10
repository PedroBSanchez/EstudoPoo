package heranca;

public class Pessoa {
    
    private String nome;
    private int idade;
    private String sexo;



    public Pessoa(String nome, int idade, String sexo) {
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
    }

    @Override
    public String toString() {
        
        return "Nome: " + getNome() + " Idade: " + getIdade() + " Sexo: " + getSexo();
    }


    
    public void fazerAniversario() {
        setIdade(getIdade() + 1);
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }

}
