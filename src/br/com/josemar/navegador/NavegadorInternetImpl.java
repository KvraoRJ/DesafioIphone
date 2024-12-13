package br.com.josemar.navegador;

public class NavegadorInternetImpl implements NavegadorInternet {

    private String url;
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

}
