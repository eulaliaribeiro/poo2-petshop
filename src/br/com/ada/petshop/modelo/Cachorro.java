package br.com.ada.petshop.modelo;

public class Cachorro {

    // atributos, o que um classe tem
    private String nome;
    private String raca;
    private int idade;
    private boolean estaDoente;
    private Dono dono;
    private int id;
    static int counter = 1;

    public Cachorro(String nome, String raca, int idade, boolean estaDoente, Dono dono) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.estaDoente = estaDoente;
        this.dono = dono;
        this.id = counter++;
    }

    public Dono getDono() {
        return dono;
    }
    public void setDono(Dono dono) {
        this.dono = dono;
    }

    /* atributo estatico, que pertence somente a classe
        havera somente uma instancia, compartilhada entre os objetos
    */

    // construtores, que podem ser usados para a criação de objetos

    // metodos, o que uma classe faz...

    // metodos de configuração - setam os valores - setters dos atributos

    public void setEstaDoente(boolean estaDoente) {
        this.estaDoente = estaDoente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    // encapsulando regra de negócio no setter
    public void setIdade(int idade) {
        if(idade < 0){
            System.err.println("Cachorro não pode ter idade negativa");
        } else if(idade > 29) {
            System.err.println("Não é permitido cachorros com idades superiores a 29 anos");
        } else {
            this.idade = idade;
        }
    }

    // metodos de consulta - consultam os valores dos atributos

    public boolean isEstaDoente() {
        return estaDoente;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }


    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +
                ", estaDoente=" + estaDoente +
                ", dono=" + dono +
                ", id=" + id +
                '}';
    }
}
