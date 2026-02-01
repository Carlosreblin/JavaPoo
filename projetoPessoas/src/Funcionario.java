public class Funcionario extends Pessoa{
    private String setor;
    private boolean Trabalhando;

    public void mudarTrabalho(){
        setTrabalhando(!this.Trabalhando);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return Trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        Trabalhando = trabalhando;
    }
}
