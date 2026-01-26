public class aula2 {
    public static void main(String[] args) {
        caneta c1 = new caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.tampar();
        //c1.status();
        c1.rabiscar();

        caneta c2 = new caneta();
        c2.modelo = "Hostnet";
        c2.cor = "preta";
        c2.destampar();
        c2.rabiscar();
    }
}
