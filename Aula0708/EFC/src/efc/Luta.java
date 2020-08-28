package efc;

import java.util.Random;

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
                         //Desafiado   Desafiante
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) { //Comparação entre strings é melhor usar .equals
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
        if (isAprovada()) {
            System.out.println("### Desafiado ###");
            this.desafiado.apresentar();
            System.out.println("### Desafiante ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            
            int vencedor = aleatorio.nextInt(3);  //Número randomico -> 0 1 2



            switch (vencedor) {
                case 0: //Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.apresentar();
                    break;

                case 1: //Vitória desafiado
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2: //Vitória desafiante
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }

        }
        else {
            System.out.println("Luta não pode acontecer");

        }
    }





    
}