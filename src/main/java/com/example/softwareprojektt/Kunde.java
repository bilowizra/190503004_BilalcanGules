package com.example.softwareprojektt;

public class Kunde extends Person {

    public String KundeBenutzerName;
    public String KundePasswort;

    public Kunde (String k_name, String k_vorname, String k_telefonnummer, String k_adresse,String k_mailadresse, String kundebenutzername, String kundepasswort){

        super(k_name, k_vorname, k_telefonnummer, k_adresse, k_mailadresse);

        this.KundeBenutzerName = kundebenutzername;
        this.KundePasswort = kundepasswort;

    }

    public String getKundeBenutzerName() {
        return KundeBenutzerName;
    }

    public void setKundeBenutzerName(String kundeBenutzerName) {
        KundeBenutzerName = kundeBenutzerName;
    }

    public String getKundePasswort() {
        return KundePasswort;
    }

    public void setKundePasswort(String kundePasswort) {
        KundePasswort = kundePasswort;
    }


}
