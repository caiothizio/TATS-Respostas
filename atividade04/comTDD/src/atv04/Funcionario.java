/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv04;

/**
 *
 * @author caiot
 */
class Funcionario {
    String cargo;
    double salario;
    
    void setCargo(String cargo) {
        this.cargo = cargo;
    }

    void setSalarioBase(double salario) {
        this.salario = salario;
    }

    String getCargo() {
        return this.cargo;
    }

    double getSalario() {
        return this.salario;
    }
    
}
