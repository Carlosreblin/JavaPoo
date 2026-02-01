public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public void viuMaisUm(){

    }

    public Gafanhoto(String nome, int idade, char sexo, String login){
        super(nome, idade, sexo);
        this.setLogin(login);
        this.setTotAssistido(0);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto: {\n" + super.toString() + "\nLogin = " + this.getLogin() + "\nTotAssistido = " + this.getTotAssistido() + "\n}";
    }
}
