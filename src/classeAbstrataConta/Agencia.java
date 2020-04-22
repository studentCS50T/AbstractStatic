package classeAbstrataConta;

/**
 *
 * @author timoteodimapereira
 */
public class Agencia {
    private int numeroAgencia;
    
    private String nome;

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Agencia(int numeroAgencia, String nome) {
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
    }
    
    public String toString(){
        return "\n ****DADOS DA AGÊNCIA***"+
                
                "\n Número de Agencia: "+getNumeroAgencia()+
                "\n Nome : "+getNome();
    }
}
