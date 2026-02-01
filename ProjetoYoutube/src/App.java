public class App {
    public static void main(String[] args) throws Exception {
        Video v[] = {new Video("Aula 1 de POO"),new Video("Aula 12 de PHP"), new Video("Aula 10 de HTML5")};
        
        //Pessoa p[] = {new Pessoa("Jubileu", 22 , 'M')};
        Gafanhoto g[] = {new Gafanhoto("Jubileu", 22, 'M', "juba"), new Gafanhoto("Creuza", 12, 'F', "creuzita")};
        
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
}
