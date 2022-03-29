package com.example.bacabuku.model;

public class Buku {

    String judulBuku;
    String penulis;
    int gambarBuku;

    public Buku(String judulBuku, String penulis, int gambarBuku) {
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.gambarBuku = gambarBuku;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getGambarBuku() {
        return gambarBuku;
    }
}
