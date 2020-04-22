package classeAbstrataConta;

/**
 *
 * @author timoteodimapereira
 */
public class Endereco {
    private String rua;
    private int numero;
    private Cep cep;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
        
    }

    public Endereco(String rua, int numero, Cep cep) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
    }
    public String toString (){
        return "\n Rua: "+getRua()+
                "\n Número: "+getNumero()+
                "\n CEP: "+getCep();
                
    }
    
}
