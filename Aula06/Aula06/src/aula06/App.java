package aula06;

public class App {
    public static void main(String[] args) throws Exception {
        ControleRemoto c1 = new ControleRemoto();

        c1.abrirMenu();
       
        c1.ligar();
        c1.desligarMudo();


        c1.abrirMenu();

        c1.maisVolume();

        c1.abrirMenu();

        c1.menosVolume();

        c1.abrirMenu();

        c1.ligarMudo();
        c1.desligar();
        c1.abrirMenu();


    }
}
