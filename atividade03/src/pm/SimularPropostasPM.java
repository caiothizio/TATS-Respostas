/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pm;

import java.util.List;
import tdd01.Calculadora;
import tdd01.Proposta;

/**
 *
 * @author Aluno
 */
public class SimularPropostasPM {

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setValorDoEmprestimo(float valorDoEmprestimo) {
        this.valorDoEmprestimo = valorDoEmprestimo;
    }

    public void setMsgDeErro(String msgDeErro) {
        this.msgDeErro = msgDeErro;
    }
    String nome;
    float salario;
    int idade;
    float valorDoEmprestimo;
    String msgDeErro;

    public String getMsgDeErro() {
        return msgDeErro;
    }

    public MostrarPropostasPM pressionarBotaoElaborar() {
        validar();

        if (msgDeErro.equals("")) {
            Calculadora c = new Calculadora();
            List<Proposta> propostas = c.calcular(salario, valorDoEmprestimo);

            return new MostrarPropostasPM(propostas);
        } else {
            return null;
        }
    }

    private void validar() {
        msgDeErro = "";
        
        if (nome.equals("")) {
            msgDeErro += "nome vazio\n";
        }

        if (salario <= 0) {
            msgDeErro += "salario vazio\n";
        }

        if (idade <= 0) {
            msgDeErro += "idade vazia\n";
        }else if(idade < 18 || idade > 70){
            msgDeErro += "idade invalida\n";
        }
        
        if (valorDoEmprestimo <= 0) {
            msgDeErro += "valor vazio\n";
        }
    }
}
