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
    public void testeSalarioDev() {
        Funcionario f = new Funcionario();
        f.setCargo("DESENVOLVEDOR");
        f.setSalarioBase(5000);
        
        CalculadoraDeSalario c = new CalculadoraDeSalario();
        
        assertEquals(c.calcularSalario(f), 4000.00f, 0.01);
    }
}
