import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos
    public void marcarLuta(Lutador l1,Lutador l2){
        if (l1.getCategoria().equalsIgnoreCase(l2.getCategoria())  && l1 != l2) {
            setAprovada(true);
            setDesafiado(l1);
            setDesafiante(l2);
        }else{
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }

    public void lutar(){
        if (isAprovada()) {
            System.out.println("### Desafiado! ###");
            System.out.println("-------------------------");
            this.desafiado.apresentar();
            System.out.println("### Desafiante! ###");
            System.out.println("-------------------------");
            this.desafiante.apresentar();
            Random aleatório = new Random();
            int vencedor = aleatório.nextInt(3);
            System.out.println("=========================");
            switch (vencedor) {
                case 0:
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    System.out.println("Empate!");
                    break;
                case 1:
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    break;
                case 2:
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    break;
                
                default:
                    break;
            }
        }else{
            System.out.println("Luta não aprovada");
        }
        System.out.println("=========================");
    }

    //Métodos Especiais
    public void setDesafiado(Lutador dd){
        this.desafiado = dd;
    }

    public Lutador getDesafiado(){
        return this.desafiado;
    }

    public void setDesafiante(Lutador de){
        this.desafiante = de;
    }

    public Lutador getDeasafiante(){
        return this.desafiante;
    }

    public void setRounds(int ro){
        this.rounds = ro;
    }

    public int getRounds(){
        return this.rounds;
    }

    public void setAprovada(boolean ap){
        this.aprovada = ap;
    }

    public boolean isAprovada(){
        return this.aprovada;
    }
}
