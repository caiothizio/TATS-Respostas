/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv04;

/**
 *
 * @author Aluno
 */
public class CalculadoraDeSalario {

    public double calcularSalarioLiquido(Funcionario f) {
        switch (f.getCargo()) {
            case "DESENVOLVEDOR":
                if (f.getSalarioBase() >= 3000) {
                    return f.getSalarioBase() - (f.getSalarioBase() * 0.2);
                } else {
                    return f.getSalarioBase() - (f.getSalarioBase() * 0.1);
                }
            case "DBA":
                if (f.getSalarioBase() >= 2000) {
                    return f.getSalarioBase() - (f.getSalarioBase() * 0.25);
                } else {
                    return f.getSalarioBase() - (f.getSalarioBase() * 0.15);
                }
            case "TESTADOR":
                if (f.getSalarioBase() >= 2000) {
                    return f.getSalarioBase() - (f.getSalarioBase() * 0.25);
                } else {
                    return f.getSalarioBase() - (f.getSalarioBase() * 0.15);
                }
            case "GERENTE":
                if (f.getSalarioBase() >= 5000) {
                    return f.getSalarioBase() - (f.getSalarioBase() * 0.3);
                } else {
                    return f.getSalarioBase() - (f.getSalarioBase() * 0.2);
                }
            default:
                return -1;
        }

    }
}
