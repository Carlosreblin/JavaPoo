public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // Métodos
    public String detalhes() {
        return "Livro{"+ "titulo=" + titulo + ", autor=" + autor + ",totPaginas=" + totPaginas + ", pagAtual=" + pagAtual + ", aberto=" + aberto + ", leitor=" + leitor.getNome() + "}";
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (aberto && p <= getTotPaginas()) {
            this.setPagAtual(p);
        }else if(!aberto){
            System.out.println("O livro está fechado!");
        }else{
            System.out.println("A página excede o total de páginas do livro!");
        }
        
    }

    @Override
    public void avancarPag() {
        if (aberto && getPagAtual() < getTotPaginas()){
            this.setPagAtual(pagAtual ++);
        }else if (!aberto) {
            System.out.println("O livro está fechado!");
        }else{
            System.out.println("Você já está na última página!");
        }
    }

    @Override
    public void voltarPag() {
        if (aberto && getPagAtual() > 1) {
            this.setPagAtual(pagAtual --);
        }else if(!aberto){
            System.out.println("O livro está fechado!");
        }else{
            System.out.println("Você está na primeira página!");
        }
        
    }

    // Métodos especiais
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        setTitulo(titulo);
        setAutor(autor);
        setTotPaginas(totPaginas);
        setPagAtual(0);
        setLeitor(leitor);

    }

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

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
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

}
