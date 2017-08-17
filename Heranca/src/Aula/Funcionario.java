package Aula;

public class Funcionario extends Pessoa{
    private float salario;
    private String cargo;

    public Funcionario() {
        System.out.println("Executando construtor da classe Funcioario");
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
