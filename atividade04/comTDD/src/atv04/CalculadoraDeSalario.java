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
class CalculadoraDeSalario {

    double calcularSalario(Funcionario f) {
        if(f.getCargo().equals("DESENVOLVEDOR")){
            return f.getSalario() >= 3000 ? f.getSalario() * 0.8 : f.getSalario() * 0.9;
        }
        
        if(f.getCargo().equals("DBA")){
            return f.getSalario() >= 2000 ? f.getSalario() * 0.75 : f.getSalario() * 0.85;
        }
        
        return -1;
    }
    
}
