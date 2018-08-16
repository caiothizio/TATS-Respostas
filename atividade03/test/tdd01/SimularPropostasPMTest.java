/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd01;

import pm.MostrarPropostasPM;
import pm.SimularPropostasPM;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aluno
 */
public class SimularPropostasPMTest {
    
    public SimularPropostasPMTest() {
    }
    
    @Test
    public void testeTodosCamposVazios() {
        SimularPropostasPM pm = new SimularPropostasPM();
        pm.setNome("");
        pm.setSalario(0.0f);
        pm.setIdade(0);
        pm.setValorDoEmprestimo(0.0f);
        assertNull(pm.pressionarBotaoElaborar());
        assertEquals("nome vazio\nsalario vazio\nidade vazia\nvalor vazio\n", pm.getMsgDeErro());
    }
    
    @Test
    public void testeSoIdadeVazia() {
        SimularPropostasPM pm = new SimularPropostasPM();
        pm.setNome("João da Silva");
        pm.setSalario(1000.0f);
        pm.setIdade(0);
        pm.setValorDoEmprestimo(800.0f);
        assertNull(pm.pressionarBotaoElaborar());
        assertEquals("idade vazia\n", pm.getMsgDeErro());
    }
    
    @Test
    public void testeDadosCorretos() {
        SimularPropostasPM pm = new SimularPropostasPM();
        pm.setNome("João da Silva");
        pm.setSalario(800.0f);
        pm.setIdade(25);
        pm.setValorDoEmprestimo(1000.0f);
        MostrarPropostasPM mostrarPm = pm.pressionarBotaoElaborar();
        assertEquals("", pm.getMsgDeErro());
        assertEquals(2, mostrarPm.getPropostas().size());
    }
    
    @Test
    public void testeSoIdadeInvalida() {
        SimularPropostasPM pm = new SimularPropostasPM();
        pm.setNome("João da Silva");
        pm.setSalario(1000.0f);
        pm.setIdade(15);
        pm.setValorDoEmprestimo(800.0f);
        assertNull(pm.pressionarBotaoElaborar());
        assertEquals("idade invalida\n", pm.getMsgDeErro());
    }
}
