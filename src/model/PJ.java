package model;

public class PJ extends Pessoa{    
    private String cnpj;

    public PJ() {
    }

    public PJ(int id, String nome, String cnpj) {
        super(id, nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
