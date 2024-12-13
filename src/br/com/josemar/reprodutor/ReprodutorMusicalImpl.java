package br.com.josemar.reprodutor;

public class ReprodutorMusicalImpl  implements ReprodutorMusical {
    private Musica musica;
    
    public ReprodutorMusicalImpl() {
    }

    public ReprodutorMusicalImpl(Musica musica) {
        this.musica = musica;
    }
    
    public Musica getMusica() {
        return musica;
    }
    
    public void setMusica(Musica musica) {
        this.musica = musica;
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }
    
    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }
    
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

}
