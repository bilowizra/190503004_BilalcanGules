package com.example.softwareprojektt;

public class Produkt {

    public String Name;
    public long ProduktCode;
    public long Preis;
    public int Garantiezeit;
    public long StromVerbrauch;
    public String Farbe;
    public String Kategorie;
    public int Versandkosten;
    public boolean Montageunterstützung;
    public boolean LagerBestand;

    public Produkt(long produktcode){

        this.ProduktCode = produktcode;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getProduktCode() {
        return ProduktCode;
    }

    public void setProduktCode(long produktCode) {
        ProduktCode = produktCode;
    }

    public long getPreis() {
        return Preis;
    }

    public void setPreis(long preis) {
        Preis = preis;
    }

    public int getGarantiezeit() {
        return Garantiezeit;
    }

    public void setGarantiezeit(int garantiezeit) {
        Garantiezeit = garantiezeit;
    }

    public long getStromVerbrauch() {
        return StromVerbrauch;
    }

    public void setStromVerbrauch(long stromVerbrauch) {
        StromVerbrauch = stromVerbrauch;
    }

    public String getFarbe() {
        return Farbe;
    }

    public void setFarbe(String farbe) {
        Farbe = farbe;
    }

    public String getKategorie() {
        return Kategorie;
    }

    public void setKategorie(String kategorie) {
        Kategorie = kategorie;
    }

    public int getVersandkosten() {
        return Versandkosten;
    }

    public void setVersandkosten(int versandkosten) {
        Versandkosten = versandkosten;
    }

    public boolean isMontageunterstützung() {
        return Montageunterstützung;
    }

    public void setMontageunterstützung(boolean montageunterstützung) {
        Montageunterstützung = montageunterstützung;
    }

    public boolean isLagerBestand() {
        return LagerBestand;
    }

    public void setLagerBestand(boolean lagerBestand) {
        LagerBestand = lagerBestand;
    }
}
