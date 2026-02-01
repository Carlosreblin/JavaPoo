public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    @Override
    public void play() {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
    }

    @Override
    public void like() {
        this.setCurtidas(curtidas ++);
    }

    @Override
    public String toString() {
        return "video: {" + "\nTitulo = " + this.getTitulo() + "\nAvaliacao = " + this.getAvaliacao() + "\nViews = " + this.getViews() + "\nCurtidas = " + this.getCurtidas() + "\nReproduzindo = " + this.isReproduzindo() + "\n}";
    }
    public Video(String titulo){
        this.setTitulo(titulo);
        this.setAvaliacao(1);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        if (this.getViews() == 1) {
            this.avaliacao = avaliacao;
        }else{
            this.avaliacao = (int)(this.getAvaliacao() + avaliacao) /2;
        }
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
}
