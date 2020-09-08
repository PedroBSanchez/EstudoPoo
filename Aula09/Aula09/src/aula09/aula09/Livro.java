package aula09;

public class Livro implements Publicacao{
    
    private String titulo;
    private String autor;
    private int totPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;



    public Livro (String titulo, String autor, int totPaginas, Pessoa leitor) {

        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;

        setAberto(false);
        setPaginaAtual(0);


    }  




    public void detalhes() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Autor " + getAutor());
        System.out.println("Total de Paginas: " + getTotPaginas());
        System.out.println("Leitor: " + leitor.getNome());
    }



    @Override
    public void abrir() {
        setAberto(true);
    }

    @Override
    public void fechar() {
        setAberto(false);
    }

    @Override
    public void folhear(int pagina) {
        setPaginaAtual(pagina);
    }   

    @Override
    public void avancarPagina() {
        setPaginaAtual(getPaginaAtual() + 1);
    }

    @Override
    public void voltarPagina() {
        setPaginaAtual(getPaginaAtual() - 1);
    }


    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }
}
