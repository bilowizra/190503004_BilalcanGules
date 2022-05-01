package com.example.softwareprojektt;

public class Person {

    public String Name;
    public String Vorname;
    public String Telefonnummer;
    public String Identifikationsnummer;
    public String MailAdresse;
    public String Adresse;

    public Person (String name, String vorname, String telefonnummer, String adresse,String mailadresse){
        this.Name = name;
        this.Vorname = vorname;
        this.Telefonnummer = telefonnummer;
        this.Adresse = adresse;
        this.MailAdresse = mailadresse;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getTelefonnummer() {
        return Telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        Telefonnummer = telefonnummer;
    }

    public String getIdentifikationsnummer() {
        return Identifikationsnummer;
    }

    public void setIdentifikationsnummer(String identifikationsnummer) {
        Identifikationsnummer = identifikationsnummer;
    }

    public String getMailAdresse() {
        return MailAdresse;
    }

    public void setMailAdresse(String mailAdresse) {
        MailAdresse = mailAdresse;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }
}
