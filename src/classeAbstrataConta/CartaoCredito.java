/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeAbstrataConta;

import java.text.DecimalFormat;

/**
 *
 * @author timoteodimapereira
 */
public class CartaoCredito {
    private int numero;
    private String dataCriacao;
    protected static Double valorDaCompra;
    private TransacaoCartao transacaoCartao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }



   

    public TransacaoCartao getTransacaoCartao() {
        return transacaoCartao;
    }

    public void setTransacaoCartao(TransacaoCartao transacaoCartao) {
        this.transacaoCartao = transacaoCartao;
    }
DecimalFormat df = new DecimalFormat("R$:#, ##0.00");
    public CartaoCredito(int numero, String dataCriacao, Double valorDaCompra, TransacaoCartao transacaoCartao) {
        this.numero = numero;
        this.dataCriacao = dataCriacao;
        CartaoCredito.valorDaCompra = valorDaCompra;
        // this.valorDaCompra = valorDaCompra;
        this.transacaoCartao = transacaoCartao;
    }
  
    public String toString(){
        return
                "\n ***DADOS DO CARTÃO***"+
                "\n Número: "+getNumero()+
                "\n Data Da Criação da Conta: "+getDataCriacao()+
                "\n Valor da Compra: "+df.format(CartaoCredito.valorDaCompra)+
                "\n Transação: "+getTransacaoCartao()+
                "\n Saldo Parcial: "+df.format(saldoParcial())
                ;

    }
    public static Double saldoParcial(){
        return Fisica.saldoAtual()-CartaoCredito.valorDaCompra;
    }
}
