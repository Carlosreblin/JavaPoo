public class Professor extends Pessoa{
    private String especialidade;
    private double salario;

    public void receberAumento(float aum){
        setSalario(this.salario + aum);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
