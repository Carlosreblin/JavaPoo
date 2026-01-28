public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void setNumConta(int n){
        this.numConta = n;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public String getDono(){
        return this.dono;
    }

    public void setSaldo(double s){
        this.saldo = s;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean st){
        this.status = st;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (this.getTipo() == "CC") {
            this.setSaldo(50);
        }else if(this.getTipo() == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta Aberta com Sucesso");
    }

    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta tem dinheiro");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta em Débito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com Sucesso");
        }
    }

    public void depositar(double v){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito Realizado com Sucesso na conta de " + this.getDono());
        }else{
            System.out.println("Inpossível Depositar");
        }
    }

    public void sacar(double v){
        if (getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("Saldo Insuficiente para Saque");
            }
        }else{
            System.out.println("Inpossível Sacar de uma conta Fechada");
        }
    }

    public void pagarMensal(){
        double v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        }else if(this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }else{
            System.out.println("Inpossível pagar de uma conta fechada!");
        }
    }

    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
}
