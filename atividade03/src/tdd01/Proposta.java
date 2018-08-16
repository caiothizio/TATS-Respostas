/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd01;

/**
 *
 * @author Aluno
 */
public class Proposta {

    Proposta(float pTotal, int pNumeroParcelas) {
        total = pTotal;
        numeroParcelas = pNumeroParcelas;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public float getValorParcela() {
        return total / numeroParcelas;
    }

    float total;
    int numeroParcelas;
  
}
