package model.dao.entities;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    @Override
    public String toString() {
        return "ClienteDTO{" +
                ", nome='" + this.nome + '\'' +
                ", cpf='" + this.cpf + '\'' +
                ", telefone='" + this.telefone + '\'' +
                '}';
    }
}
