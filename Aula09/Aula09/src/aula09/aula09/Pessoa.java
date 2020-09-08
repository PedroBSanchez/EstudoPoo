package aula09;

import aula09.valueobject.*;

public class Pessoa {
    
    private Nome nome;
    private Idade idade;
    private Sexo sexo;


    public Pessoa(String novoNome, int novaIdade, String novoSexo) {
        this.nome = new Nome(novoNome);
        this.idade = new Idade(novaIdade);
        this.sexo = new Sexo(novoSexo);
    }


    public void apresentar() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
    }


    public void fazerAniversario() {
        setIdade(getIdade() + 1);

    }




    public String getNome() {
        return nome.getValor();
    }

    public void setNome(Nome nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade.getValor();
    }

    public void setIdade(int idade) {
        this.idade.setValor(idade);
    }

    public String getSexo() {
        return sexo.getValor();
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    

}
