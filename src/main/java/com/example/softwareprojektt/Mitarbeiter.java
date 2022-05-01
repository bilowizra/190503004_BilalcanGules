package com.example.softwareprojektt;

public class Mitarbeiter extends Person{

    String Personalid;
    String MitarbeiterBenutzerName;
    String MitarbeiterPasswort;

    public Mitarbeiter (String k_name, String k_vorname, String k_telefonnummer, String k_adresse,String k_mailadresse,String m_benutzername,String m_passwort){

        super(k_name, k_vorname, k_telefonnummer, k_adresse, k_mailadresse);
        this.MitarbeiterBenutzerName = m_benutzername;
        this.MitarbeiterPasswort = m_passwort;

    }

    public void setProdukt(long ProduktCode){


    }

    public void loescheProdukt(){
    }

    public void setRechnung(long RechnungId){
    }

    public void LoescheRechnung(){
    }

    public String getPersonalid() {
        return Personalid;
    }

    public void setPersonalid(String personalid) {

        Personalid = personalid;
    }

    public String getMitarbeiterBenutzerName() {

        return MitarbeiterBenutzerName;
    }

    public void setMitarbeiterBenutzerName(String mitarbeiterBenutzerName) {
        MitarbeiterBenutzerName = mitarbeiterBenutzerName;
    }

    public String getMitarbeiterPasswort() {

        return MitarbeiterPasswort;
    }

    public void setMitarbeiterPasswort(String mitarbeiterPasswort) {

        MitarbeiterPasswort = mitarbeiterPasswort;
    }
}
