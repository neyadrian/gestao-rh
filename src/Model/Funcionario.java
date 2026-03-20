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
}
