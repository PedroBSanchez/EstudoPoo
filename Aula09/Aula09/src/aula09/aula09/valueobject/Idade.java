package aula09.valueobject;

public class Idade {
    
    private int valor;

    public Idade(int valor) {
        validacao.validaIdade(valor);
        setValor(valor);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }




    
}
