package Model;
import Enum.Departamento;


public class Funcionario {
    private String nome;
    private double salarioBase;
    private Departamento departamento;

    public Funcionario(String nome, Departamento departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) {
            System.out.println("Salários não pode ser negativo");
            this.salarioBase = 0;
        } else {
            this.salarioBase = salarioBase;
        }
    }
}
