package com.emin.repository.entity;

public class Musteri {

    long id;
    String ad;
    String soyad;
    String adres;
    String telefon;
    String Tckimlik;
    String not;

    public Musteri(long id, String ad, String soyad, String adres, String telefon, String tckimlik, String not) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.adres = adres;
        this.telefon = telefon;
        Tckimlik = tckimlik;
        this.not = not;
    }

    public Musteri() {

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getNot() {
        return not;
    }

    public void setNot(String not) {
        this.not = not;

    }

    public String getTckimlik() {
        return Tckimlik;
    }

    public void setTckimlik(String tckimlik) {
        Tckimlik = tckimlik;
    }
}
