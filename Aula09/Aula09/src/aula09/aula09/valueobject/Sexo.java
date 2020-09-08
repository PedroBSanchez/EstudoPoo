package aula09.valueobject;

public class Sexo {
    
    private String valor;

    public Sexo (String valor) {
        validacao.validaSexo(valor);
        setValor(valor);
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    

}
