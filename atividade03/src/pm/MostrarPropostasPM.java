/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pm;

import java.util.List;
import tdd01.Proposta;

/**
 *
 * @author Aluno
 */
public class MostrarPropostasPM {
    List<Proposta> propostas;
    
    MostrarPropostasPM(List<Proposta> pPropostas) {
        propostas = pPropostas;
    }

    public List<Proposta> getPropostas() {
        return propostas;
    }
    
}
