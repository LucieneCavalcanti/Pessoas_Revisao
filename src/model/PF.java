package model;

public class PF extends Pessoa{
    private String cpf;

    public PF() {
    }

    public PF(int id, String nome, String cpf) {
        super(id, nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
