public class Laerer {
    private int lnr;
    private String fornavn;
    private String efternavn;
    private String adresse;
    private String telefonnr;
    private String mail;
    private String cprnr;

    public Laerer() {
    }

    public Laerer(int lnr, String fornavn, String efternavn, String adresse, String telefonnr, String mail, String cprnr) {
        this.lnr = lnr;
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
        this.mail = mail;
        this.cprnr = cprnr;
    }

    public int getLnr() {
        return lnr;
    }

    public void setLnr(int lnr) {
        this.lnr = lnr;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCprnr() {
        return cprnr;
    }

    public void setCprnr(String cprnr) {
        this.cprnr = cprnr;
    }
}
