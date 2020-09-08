package aula09.valueobject;

public class validacao {
    


    public static void validaNome(String valor) {
        
        if (valor.trim().split(" ").length == 1 || valor.trim().length() == 1) {
            throw new RuntimeException("Nome precisa ter pelo menos duas palavras");
        }
    }

    public static void validaIdade(int valor) {
        if (valor <= 0) {
            throw new RuntimeException("Idade deve ser positiva");
        }
        else if (valor < 5) {
            throw new RuntimeException("Idade deve ser de no mínimo 12 anos");
        }
    }


    public static void validaSexo (String valor) {

        if (valor.trim().toUpperCase() != "MASCULINO" && valor.trim().toUpperCase() != "FEMININO" && valor.trim().toUpperCase() != "OUTROS") {
            
            throw new RuntimeException("Sexo deve ser masculino ou feminino ou outros");

        }
    }




}
