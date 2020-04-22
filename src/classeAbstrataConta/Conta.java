package classeAbstrataConta;

import java.text.DecimalFormat;

/**
 *
 * @author timoteodimapereira
 */
public class Conta {
    private int numeroConta;
    private Double saldo;
    private Transacao transacao;
    private Agencia agencia;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Transacao getTransacao() {
        return transacao;
    }

    public void setTransacao(Transacao transacao) {
        this.transacao = transacao;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
DecimalFormat df = new DecimalFormat("R$:#, ##0.00");
    public Conta(int numeroConta, Double saldo, Transacao transacao, Agencia agencia) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.transacao = transacao;
        this.agencia = agencia;
    }
    public String toString(){
        return "\n ***DADOS DA CONTA***"+
                "\n Número da Conta: "+getNumeroConta()+
                "\n Saldo da Conta: "+df.format(getSaldo())+
                "\n Transação: "+getTransacao()+
                "\n Agência: "+getAgencia()+
        "\n Saldo da Conta: "+df.format(Conta.saldoConta());
    }
    public static Double saldoConta(){
        return TransacaoCartao.saldoFuturo()-TransacaoCartao.valor;
    }
}
