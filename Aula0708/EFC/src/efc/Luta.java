package efc;

public class Luta {

    private Lutador desafiado; // tipo abstrato de dado -> instancia da classe lutador
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }




    




 

    //Métodos marcarLuta(), lutar()
    /*
        Regras da luta
            - Só pode ser marcada entre lutadores da mesma categoria.
            - Desafiado e desafiante devem ser lutadores diferentes.
            - Só pode acontecer de a luta estiver aprovada.
            - Só pode ter como resultado a vitória de um dos lutadores ou o empate.

    */

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            setAprovada(true);
            setDesafiado(l1);
            setDesafiante(l2);
        }
        else {
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }


    public void lutar() {
        if (aprovada) {
            
        }
        else {
            System.out.println("Luta não pode acontecer");

        }
    }





    
}