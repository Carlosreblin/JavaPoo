public class UEC {
    public static void main(String[] args) {
        Lutador L[]={new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 3, 1),new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3), new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2), new Lutador("UFOCobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3), new Lutador("Nerdaart", "EUA", 30, 1.81, 105.7, 12, 2, 4)};

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(L[0], L[1]);
        UEC01.lutar();
        L[0].status();
        L[1].status();
    }

}