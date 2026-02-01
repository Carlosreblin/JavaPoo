public class App {
    public static void main(String[] args) throws Exception {
        Video v[] = {new Video("Aula 1 de POO"),new Video("Aula 12 de PHP"), new Video("Aula 10 de HTML5")};
        
        //Pessoa p[] = {new Pessoa("Jubileu", 22 , 'M')};
        Gafanhoto g[] = {new Gafanhoto("Jubileu", 22, 'M', "juba"), new Gafanhoto("Creuza", 12, 'F', "creuzita")};

        Visualizacao vis[] = {new Visualizacao(g[0], v[2]), new Visualizacao(g[0], v[1])};
        vis[0].avaliar();
        vis[1].avaliar(70f);
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
    }
}
