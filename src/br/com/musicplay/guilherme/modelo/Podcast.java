package br.com.musicplay.guilherme.modelo;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;
    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
     public int getClassificacao(){
        if (this.getTotalReproducao() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
