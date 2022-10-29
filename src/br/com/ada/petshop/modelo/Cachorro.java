package br.com.ada.petshop.modelo;

public class Cachorro {

    private String nome;
    private String raca;

    private int idade;

    private static int contador;

    private boolean estaDoente;

    public Cachorro(){
        contador++;
    }

    public Cachorro(String nome){
        contador++;
        this.nome = nome;
    }

    public Cachorro(String nome, int idade){
        contador++;
        this.nome = nome;
        setIdade(idade);
    }



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

    public static int getContador() {
        return contador;
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
                '}';
    }
}
