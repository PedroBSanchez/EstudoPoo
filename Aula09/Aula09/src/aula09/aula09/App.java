package aula09;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        Pessoa p = new Pessoa("Pedro Sanchez", 19, "MASCULINO");

        Livro l = new Livro("Xesquedele", "Xandão", 75, p);

        p.apresentar();
        p.fazerAniversario();
        p.apresentar();

        l.detalhes();

        l.abrir();

        l.detalhes();



    }

}
