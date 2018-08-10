package atv02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.logging.Level;
import java.util.logging.Logger;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author caio.thizio
 */
public class UsuarioValidatorTest {
    
    @Test
    public void teste01(){
        SenhaValidator senhaMock = mock(SenhaValidator.class);
        UsuarioDAO daoMock = mock(UsuarioDAO.class);
        Usuario user = new Usuario();
        user.setNome("A");
        
        UsuarioValidator validator = new UsuarioValidator(daoMock);
        validator.setSenhaValidator(senhaMock);
        
        try {
            validator.ehUsuarioValido(user);
            fail();
        } catch (Exception ex) {
            assertThat(ex.getMessage(), is("nome do usuario precisa de pelo menos 5 caracteres"));
        }
    }
    
    @Test
    public void teste02(){
        SenhaValidator senhaMock = mock(SenhaValidator.class);
        UsuarioDAO daoMock = mock(UsuarioDAO.class);
        Usuario user = new Usuario();
        user.setNome("Jonas");
        user.setSenha("A");
        user.setSenhaConfirmada("B");
        
        UsuarioValidator validator = new UsuarioValidator(daoMock);
        validator.setSenhaValidator(senhaMock);
        
        try {
            validator.ehUsuarioValido(user);
            fail();
        } catch (Exception ex) {
            assertThat(ex.getMessage(), is("senhas diferentes"));
        }
    }
    
    @Test
    public void teste03(){
        SenhaValidator senhaMock = mock(SenhaValidator.class);
        UsuarioDAO daoMock = mock(UsuarioDAO.class);
        Usuario user = new Usuario();
        user.setNome("Jonas");
        user.setSenha("A");
        user.setSenhaConfirmada("A");
        
        UsuarioValidator validator = new UsuarioValidator(daoMock);
        validator.setSenhaValidator(senhaMock);
        
        when(senhaMock.verificar(anyString())).thenReturn(true);
        
        try {
            validator.ehUsuarioValido(user);
            fail();
        } catch (Exception ex) {
            assertThat(ex.getMessage(), is("senha invalida"));
        }
    }
    
    @Test
    public void teste04(){
        SenhaValidator senhaMock = mock(SenhaValidator.class);
        UsuarioDAO daoMock = mock(UsuarioDAO.class);
        Usuario user = new Usuario();
        user.setNome("Jona$");
        user.setSenha("A");
        user.setSenhaConfirmada("A");
        
        UsuarioValidator validator = new UsuarioValidator(daoMock);
        validator.setSenhaValidator(senhaMock);
        
        when(senhaMock.verificar(anyString())).thenReturn(false);
        when(daoMock.getByName(anyString())).thenReturn(user);
        
        try {
            validator.ehUsuarioValido(user);
            fail();
        } catch (Exception ex) {
            assertThat(ex.getMessage(), is("usuario ja existe"));
        }
    }
    
    @Test
    public void teste05(){
        SenhaValidator senhaMock = mock(SenhaValidator.class);
        UsuarioDAO daoMock = mock(UsuarioDAO.class);
        Usuario user = new Usuario();
        user.setNome("Jona5");
        user.setSenha("A");
        user.setSenhaConfirmada("A");
        
        UsuarioValidator validator = new UsuarioValidator(daoMock);
        validator.setSenhaValidator(senhaMock);
        
        when(senhaMock.verificar(anyString())).thenReturn(false);
        when(daoMock.getByName(anyString())).thenReturn(null);
        
        try {
           assertEquals(true, validator.ehUsuarioValido(user));
            
        } catch (Exception ex) {
            fail();
        }
    }
}
