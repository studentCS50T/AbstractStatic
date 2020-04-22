/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeAbstrataConta;

/**
 *
 * @author timoteodimapereira
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fisica pessoaFisica = new Fisica(25000.00, 2000.00, "Tim", "61-447565575", 20000.00, 
                new Endereco("SHT", 32, 
                        new Cep("3444")), 
                new Conta(32, 100.00, 
                        new Transacao("TED", 1000.00), 
                        new Agencia(23, "BRB")), 
                new CartaoCredito(34, "04/04/2012", 200.00, 
                        new TransacaoCartao(12, 1500.00)), 
                "4455555555-54");
        
           System.out.println(pessoaFisica);
           
       
     
           
    }
    
}
