package com.example.model;

public class Musica {

    private String nomeMusica,nomeBanda_artista,nomeAlbum,anoAlbum;
    private int imgAlbum;

    public Musica(String nomeMusica, String nomeBanda_artista) {
        this.nomeMusica = nomeMusica;
        this.nomeBanda_artista = nomeBanda_artista;
    }

    public Musica(int imgAlbum) {
        this.imgAlbum = imgAlbum;
    }

    public Musica(String nomeAlbum, String anoAlbum, int imgAlbum) {
        this.nomeAlbum = nomeAlbum;
        this.anoAlbum = anoAlbum;
        this.imgAlbum = imgAlbum;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getNomeBanda_artista() {
        return nomeBanda_artista;
    }

    public void setNomeBanda_artista(String nomeBanda_artista) {
        this.nomeBanda_artista = nomeBanda_artista;
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public String getAnoAlbum() {
        return anoAlbum;
    }

    public void setAnoAlbum(String anoAlbum) {
        this.anoAlbum = anoAlbum;
    }

    public int getImgAlbum() {
        return imgAlbum;
    }

    public void setImgAlbum(int imgAlbum) {
        this.imgAlbum = imgAlbum;
    }
}
