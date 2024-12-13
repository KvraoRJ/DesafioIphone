package br.com.josemar.telefone;

import java.util.ArrayList;
import java.util.List;

public class AparelhoTelefonicoImpl     implements AparelhoTelefonico {
    private List<Contato> contatos;

    public AparelhoTelefonicoImpl() {
        this.contatos = new ArrayList<>();
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

      @Override
    public void ligar() {
        System.out.println("Ligando para " + contatos);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }
}
