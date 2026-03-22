package Model;
import Enum.Departamento;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salarioBase, Departamento departamento, double bonus) {
        super(nome, salarioBase, departamento);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }
}
