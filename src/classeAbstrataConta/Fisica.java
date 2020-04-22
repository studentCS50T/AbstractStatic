package classeAbstrataConta;

import java.text.DecimalFormat;

/**
 *
 * @author timoteodimapereira
 */
public class Fisica extends Pessoa{
private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    DecimalFormat df = new DecimalFormat("R$:#, ##0.00");
public Fisica(Double saldo, Double valorGasto, String nome, 
        String telefone, Double limite, Endereco endereco,
        Conta conta, CartaoCredito cartaoCredito, String cpf ){
    super (saldo, valorGasto, nome, telefone, limite, endereco, conta, cartaoCredito);
    this.cpf = cpf;
}

      public String toString (){
           return "\n ***DADOS DA PESSOA****"+
                   "\n Nome: "+getNome()+
               "\n Telefione: "+getTelefone()+
               "\n CPF: "+getCpf()+
               "\n Limite: "+df.format(getLimite())+
               "\n Valor Gasto: "+df.format(Pessoa.valorGasto)+
               "\n Endereço: "+getEndereco()+
               "\n Conta: "+getConta()+
               "\n Cartão de Credito: "+getCartaoCredito()+
               "\n Saldo Atual: "+df.format(Fisica.saldoAtual());
      }  
      
          public static Double saldoAtual(){
              return Pessoa.saldo-Pessoa.valorGasto;
          }    
    

    }

  
