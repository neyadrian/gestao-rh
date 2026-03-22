package Sistema;

import Model.Funcionario;
import Model.Gerente;
import Enum.Departamento;
import Model.Vendedor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

        Funcionario g1 = new Gerente("Ney", 8000, Departamento.FINANCEIRO, 2000);
        Funcionario g2 = new Gerente("Priscila", 9000, Departamento.RH, 2500);
        Funcionario v1 = new Vendedor("Aelcio", 4000, Departamento.VENDAS, 1500);
        Funcionario v2 = new Vendedor("Evely", 3500, Departamento.VENDAS, 1200);

        listaFuncionarios.add(g1);
        listaFuncionarios.add(g2);
        listaFuncionarios.add(v1);
        listaFuncionarios.add(v2);

        for (Funcionario f : listaFuncionarios) {
            System.out.println(f.getNome() + " recebe: R$ " + f.calcularSalario());

            if (f instanceof Gerente) {
                Gerente g = (Gerente) f;
                System.out.println("-- Bônus do gerente: R$ " + g.getBonus());
            }
        }
    }
}