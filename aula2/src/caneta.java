public class caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("está tampada? " +  this.tampada);
    }

    void rabiscar (){
        if (!this.tampada) {
            System.out.println("Estou rabiscando");
        }else{
            System.out.println("não posso rabiscar");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }

}
