public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Métodos
    public void apresentar(){
        System.out.println("CHEGOU A HORA! Apresentamos o lutador: " + getNome());
        System.out.println("Direto de: " + getNacionalidade());
        System.out.println(getIdade() + "anos");
        System.out.println("Com: " + getPeso() + "Kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
        System.out.println("-------------------------");
    }

    public void status(){
        System.out.println(getNome());
        System.out.println("É um peso: " + getCategoria());
        System.out.println(getVitorias() + "  Vitórias");
        System.out.println(getDerrotas() + "  Derrotas");
        System.out.println(getEmpates() + "  Empates");
        System.out.println("-------------------------");
    }

    public void ganharLuta(){
        setVitorias(vitorias + 1);
    }

    public void perderLuta(){
        setDerrotas(derrotas + 1);
    }

    public void empatarLuta(){
        setEmpates(empates + 1);
    }

    //Métodos especiais
    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em){
        setNome(no);
        setNacionalidade(na);
        setIdade(id);
        setAltura(al);
        setPeso(pe);
        setVitorias(vi);
        setDerrotas(de);
        setEmpates(em);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (peso < 52.2) {
            categoria = "Inválido";
        }else if(peso <= 70.3){
            categoria = "Leve";
        }else if (peso <= 83.9){
            categoria = "Médio";
        }else if(peso <= 120.2){
            categoria = "Pesado";
        }else{
            categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
