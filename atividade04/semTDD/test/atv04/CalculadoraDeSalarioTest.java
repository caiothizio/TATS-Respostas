/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv04;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class CalculadoraDeSalarioTest {
    
    public CalculadoraDeSalarioTest() {
    }
    
    @Test
    public void testeSalarioDesenvolvedor() {
        Funcionario f1 = new Funcionario("Jonas", "jonas@utfpr.edu.br", 5000f, "DESENVOLVEDOR");
        Funcionario f2 = new Funcionario("Pedro", "pedro@utfpr.edu.br", 2000f, "DESENVOLVEDOR");
        CalculadoraDeSalario calc = new CalculadoraDeSalario();
        
        assertEquals(calc.calcularSalarioLiquido(f1), 4000.00f, 0.01);
        assertEquals(calc.calcularSalarioLiquido(f2), 1800.00f, 0.01);
    }
    
    @Test
    public void testeSalarioDBA() {
        Funcionario f1 = new Funcionario("Jonas", "jonas@utfpr.edu.br", 4000f, "DBA");
        Funcionario f2 = new Funcionario("Pedro", "pedro@utfpr.edu.br", 2000f, "DBA");
        CalculadoraDeSalario calc = new CalculadoraDeSalario();
        
        assertEquals(calc.calcularSalarioLiquido(f1), 3000.00f, 0.01);
        assertEquals(calc.calcularSalarioLiquido(f2), 1500.00f, 0.01);
    }
    
    @Test
    public void testeSalarioTestador() {
        Funcionario f1 = new Funcionario("Jonas", "jonas@utfpr.edu.br", 4000f, "TESTADOR");
        Funcionario f2 = new Funcionario("Pedro", "pedro@utfpr.edu.br", 2000f, "TESTADOR");
        CalculadoraDeSalario calc = new CalculadoraDeSalario();
        
        assertEquals(calc.calcularSalarioLiquido(f1), 3000.00f, 0.01);
        assertEquals(calc.calcularSalarioLiquido(f2), 1500.00f, 0.01);
    }

    
    @Test
    public void testeSalarioGerente() {
        Funcionario f1 = new Funcionario("Jonas", "jonas@utfpr.edu.br", 2500f, "GERENTE");
        Funcionario f2 = new Funcionario("Pedro", "pedro@utfpr.edu.br", 1000f, "GERENTE");
        CalculadoraDeSalario calc = new CalculadoraDeSalario();
        
        assertEquals(calc.calcularSalarioLiquido(f1), 2000.00f, 0.01);
        assertEquals(calc.calcularSalarioLiquido(f2), 800.00f, 0.01);
    }
    
    @Test
    public void testeFuncionarioCargoInvalido() {
        Funcionario f1 = new Funcionario("Jonas", "jonas@utfpr.edu.br", 2500f, "AAAAA");
        Funcionario f2 = new Funcionario("Pedro", "pedro@utfpr.edu.br", 1000f, "BBBBB");
        CalculadoraDeSalario calc = new CalculadoraDeSalario();
        
        assertEquals(calc.calcularSalarioLiquido(f1), -1.0f, 0.01);
        assertEquals(calc.calcularSalarioLiquido(f2), -1.0f, 0.01);
    }

}
