package classeAbstrataConta;

/**
 *
 * @author timoteodimapereira
 */
public abstract class Pessoa {
    protected static Double saldo;
    private String nome;
     private String telefone;
    private Double limite;
    protected static  Double valorGasto;
    private Endereco endereco;
    private Conta conta;
    private CartaoCredito cartaoCredito;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public CartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public Pessoa(Double saldo, Double valorGasto, String nome, 
            String telefone, Double limite, Endereco endereco, 
            Conta conta, CartaoCredito cartaoCredito) {
        this.nome = nome;
        this.telefone = telefone;
        this.limite = limite;
        this.endereco = endereco;
        this.conta = conta;
        this.cartaoCredito = cartaoCredito;
        Pessoa.saldo= saldo;
        Pessoa.valorGasto = valorGasto;
        
    }

  public abstract String toString();
  

   
    }


