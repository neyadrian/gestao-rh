package Model;
import Enum.Departamento;

public class Vendedor extends Funcionario{
    private double comissao;

    public Vendedor(String nome, double salarioBase, Departamento departamento, double comissao) {
        super(nome, salarioBase, departamento);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario(){
        return getSalarioBase() + comissao;
    }
}
