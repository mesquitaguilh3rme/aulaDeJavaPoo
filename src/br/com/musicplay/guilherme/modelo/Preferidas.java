package br.com.musicplay.guilherme.modelo;

public class Preferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9 ){
            System.out.println(audio.getTitulo() + " é considerado o melhor podcast");
        }else{
            System.out.println(audio.getTitulo() + " recomendo escutar");
        }
    }
}
