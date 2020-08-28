package efc;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        


        Lutador jhonny = new Lutador("Jhonny" , "brasileiro", 27, 1.85f, 89.7f, 5, 3, 1);




        jhonny.apresentar();

        jhonny.status();

        jhonny.ganharLuta();
        jhonny.perderLuta();
        jhonny.empatarLuta();

        jhonny.status();


    }
}
