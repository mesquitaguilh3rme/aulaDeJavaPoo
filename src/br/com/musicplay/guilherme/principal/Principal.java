package br.com.musicplay.guilherme.principal;
import br.com.musicplay.guilherme.modelo.Musicas;
import br.com.musicplay.guilherme.modelo.Podcast;
import br.com.musicplay.guilherme.modelo.Preferidas;

public class Principal {
    public static void main(String[] args) {
        Musicas minhasMusicas = new Musicas();
        minhasMusicas.setTitulo("Fim de Tarde");
        minhasMusicas.setArtista("Tarcis");

        for (int i = 0; i < 1000; i++) {
            minhasMusicas.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhasMusicas.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Programação Back-End");
        meuPodcast.setApresentador("Paulo Silveira");

        for (int i = 0; i < 5000; i++) {
           meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhasMusicas);
    }
}
