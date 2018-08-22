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
 * @author caiot
 */
public class CalculadoraDeSalarioTest {
    
    public CalculadoraDeSalarioTest() {
    }

    @Test
    public void testeSalarioDev(){
        Funcionario f = new Funcionario();
        f.setCargo("DESENVOLVEDOR");
        f.setSalarioBase(5000f);
        
        CalculadoraDeSalario c = new CalculadoraDeSalario();
        
        assertEquals(4000f, c.calcularSalario(f), 0.01);
    }
    
    @Test
    public void testeSalarioDBA(){
        Funcionario f = new Funcionario();
        f.setCargo("DBA");
        f.setSalarioBase(4000f);
        
        CalculadoraDeSalario c = new CalculadoraDeSalario();
        
        assertEquals(3000f, c.calcularSalario(f), 0.01);
    }
    
    @Test
    public void testeSalarioTestador(){
        Funcionario f = new Funcionario();
        f.setCargo("TESTADOR");
        f.setSalarioBase(550f);
        
        CalculadoraDeSalario c = new CalculadoraDeSalario();
        
        assertEquals(467.5f, c.calcularSalario(f), 0.01);
    }
    
    @Test
    public void testeSalarioGerente(){
        Funcionario f = new Funcionario();
        f.setCargo("GERENTE");
        f.setSalarioBase(2500f);
        
        CalculadoraDeSalario c = new CalculadoraDeSalario();
        
        assertEquals(2000f, c.calcularSalario(f), 0.01);
    }
}
