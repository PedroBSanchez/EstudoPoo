package aula06;

public class ControleRemoto implements Controlador {

    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;


    // Construtores
    public ControleRemoto (){
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }



    // Métodos abstratos

    @Override
    public void abrirMenu() {
        System.out.println("--------MENU--------");
        System.out.println("Ligado: " + isLigado());
        System.out.println("Tocando: " + isTocando());
        System.out.println("Volume: " + getVolume());
        for (int x = 0; x <= getVolume(); x++) {
            System.out.printf("|");
        }
        System.out.println("\n");
    }

    @Override
    public void desligar() {
        if (isLigado()) {
            setLigado(false);
        }
        else {
            System.out.println("Controle já está desligado");
        }
    }

    @Override
    public void desligarMudo() {
        if (!isTocando()) {
            setTocando(true);
        }
        else {
            System.out.println("Controle já está tocando");
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");

    }

    @Override
    public void ligar() {
        if (!isLigado()) {
            setLigado(true);
        }
        else {
            System.out.println("Controle já está ligado");
        }
    }

    @Override
    public void ligarMudo() {
        if (isTocando()) {
            setTocando(false);
        }
        else {
            System.out.println("Controle já está mudo");
        }

    }

    @Override
    public void maisVolume() {
        // Volume máximo = 100
        if (isLigado() && getVolume() < 100) {
            setVolume(getVolume() + 1);
        }
        else if (isLigado() && getVolume() >= 100) {
            System.out.println("Volume já está no máximo");
        }
        else {
            System.out.println("Controle desligado");
        }
    }

    @Override
    public void menosVolume() {
        // Volume mínimo = 0
        if (isLigado() && getVolume() > 0) {
            setVolume(getVolume() - 1);
        }
        else if (isLigado() && getVolume() <= 0) {
            System.out.println("Volume já está no mínimo");
        }
        else {
            System.out.println("Controle desligado");
        }
        
    }

    @Override
    public void pause() {
        if (isLigado() && isTocando()) {
            setTocando(false);
        }

    }

    @Override
    public void play() {
        if (isLigado() && !isTocando()) {
            setTocando(true);
        }

    }

    //Métodos Getters e Setters
    public int getVolume() {
        return volume;
    }

    public void setVolume(final int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(final boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(final boolean tocando) {
        this.tocando = tocando;
    }
    
    
}