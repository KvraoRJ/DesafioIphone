package br.com.josemar.telefone;

public class Contato {
    private String nome;
    private String telefone;

    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone;
    }
}
