package br.com.josemar.reprodutor;

public class Musica {
    private String nome;
    private String artista;
    private String album;
    private int duracao;

    public String getAlbum() {
        return album;
    }
    public String getArtista() {
        return artista;
    }
    public int getDuracao() {
        return duracao;
    }
    public String getNome() {
        return nome;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
