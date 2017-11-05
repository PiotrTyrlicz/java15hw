package com.example.demo;

public class Wydatek {
    private String nazwa;
    private double cena;
    private String kategoria;

    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getKategoria() {
        return kategoria;
    }
    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public double getCena() {
        return cena;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }

    public Wydatek(){

    }
    public Wydatek(String nazwa, double cena, String kategoria) {
        this.nazwa = nazwa;
        this.kategoria = kategoria;
        this.cena = cena;
    }


    @Override
    public String toString() {
        return "Wydatek{" +
                "nazwa='" + nazwa + '\'' +
                ", kategoria='" + kategoria + '\'' +
                ", cena=" + cena +
                '}';
    }
}
