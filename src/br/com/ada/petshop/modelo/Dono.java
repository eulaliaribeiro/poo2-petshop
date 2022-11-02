package br.com.ada.petshop.modelo;

public class Dono {
    private String nome;
    private String cpf;
    private String email;
    private Endereco endereco;

    private int id;
    static int counter = 1;



    public Dono(String nome, String cpf, String email, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.id = counter++;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Dono{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", id=" + id +
                '}';
    }
}
