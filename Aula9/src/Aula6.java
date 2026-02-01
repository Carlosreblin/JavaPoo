public class Aula6 {
    public static void main(String[] args) {
        Pessoa p[] = {new Pessoa("Pedro", 22, 'M'), new Pessoa("Maria", 25, 'F')};
        Livro l[] = {new Livro("Aprendendo Java", "José da Silva", 300, p[0]),new Livro("Java avançado", "Maria Candido", 800, p[0])};

        l[0].abrir();
        l[0].folhear(1000);

        System.out.println(l[0].detalhes());
    }
}
