package classeAbstrataConta;

import java.text.DecimalFormat;

/**
 *
 * @author timoteodimapereira
 */
public class Transacao {
    private String tipo;
    private Double valorTransacao;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(Double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }
DecimalFormat df = new DecimalFormat("R$:#, ##0.00");
    public Transacao(String tipo, Double valorTransacao) {
        this.tipo = tipo;
        this.valorTransacao = valorTransacao;
    }
    public String toString(){
        return "***TRANSACÃO***"+
                "\n Tipo de Transação: "+getTipo()+
                "\n Valor da Transação: "+df.format(getValorTransacao())+
                "\n Saldo Futuro: "+df.format(TransacaoCartao.saldoFuturo());
    }
    public Double saldoFuturo(){
        return CartaoCredito.saldoParcial()-TransacaoCartao.valor;
    }
}
