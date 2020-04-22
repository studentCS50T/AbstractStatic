package classeAbstrataConta;

import java.text.DecimalFormat;

/**
 *
 * @author timoteodimapereira
 */
public class TransacaoCartao {
    private int numero;
    protected static Double valor;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    DecimalFormat df = new DecimalFormat("R$:#, ##0.00");

    public TransacaoCartao(int numero, Double valor) {
        this.numero = numero;
        TransacaoCartao.valor = valor;

    }
    
    public String toString (){
        return "****INFORMAÇÃO DO CARTÃO***"+
                "\n Número: "+getNumero()+
                "\n Valor: "+df.format(TransacaoCartao.valor)+
                "\n Saldo Futuro: "+df.format(TransacaoCartao.saldoFuturo());
                
    }
    public static Double saldoFuturo(){
        return CartaoCredito.saldoParcial()-TransacaoCartao.valor;
    }
}
