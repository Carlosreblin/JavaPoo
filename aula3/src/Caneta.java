public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("está tampada? " +  this.tampada);
    }

    public void rabiscar (){
        if (!this.tampada) {
            System.out.println("Estou rabiscando");
        }else{
            System.out.println("não posso rabiscar");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

}
