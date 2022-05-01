package com.example.softwareprojektt;

public class Rechnung {

    public String KundenName;
    public String KundenVorname;
    public String ProduktName;
    public int AnzahlderProdukte;
    public long Betrag;
    public long RechnungId;
    public String KundenAdresse;
    public String KundenTelefonnumer;

    public Rechnung (String kundenname, String kundenvorname, long rechnungid){

        this.KundenName = kundenname;
        this.KundenVorname = kundenvorname;
        this.RechnungId = rechnungid;
    }

    public String getKundenName() {
        return KundenName;
    }

    public void setKundenName(String kundenName) {
        KundenName = kundenName;
    }

    public String getKundenVorname() {
        return KundenVorname;
    }

    public void setKundenVorname(String kundenVorname) {
        KundenVorname = kundenVorname;
    }

    public String getProduktName() {
        return ProduktName;
    }

    public void setProduktName(String produktName) {
        ProduktName = produktName;
    }

    public int getAnzahlderProdukte() {
        return AnzahlderProdukte;
    }

    public void setAnzahlderProdukte(int anzahlderProdukte) {
        AnzahlderProdukte = anzahlderProdukte;
    }

    public long getBetrag() {
        return Betrag;
    }

    public void setBetrag(long betrag) {
        Betrag = betrag;
    }

    public long getRechnungId() {
        return RechnungId;
    }

    public void setRechnungId(long rechnungId) {
        RechnungId = rechnungId;
    }

    public String getKundenAdresse() {
        return KundenAdresse;
    }

    public void setKundenAdresse(String kundenAdresse) {
        KundenAdresse = kundenAdresse;
    }

    public String getKundenTelefonnumer() {
        return KundenTelefonnumer;
    }

    public void setKundenTelefonnumer(String kundenTelefonnumer) {
        KundenTelefonnumer = kundenTelefonnumer;
    }
}
