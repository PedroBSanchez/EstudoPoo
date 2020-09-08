package aula09.valueobject;

public class Nome {
    
    private String valor;

    public Nome(String valor) {
        validacao.validaNome(valor);
        setValor(valor);
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }



}
