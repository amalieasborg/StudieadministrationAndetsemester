public class Studerende {
    private String stdnr;
    private String fornavn;
    private String efternavn;
    private String adresse;
    private String telefonnr;
    private String mail;
    private String cprnr;

    public Studerende() {
    }

    public Studerende(String stdnr, String fornavn, String efternavn, String adresse, String telefonnr, String mail, String cprnr) {
        this.stdnr = stdnr;
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
        this.mail = mail;
        this.cprnr = cprnr;
    }

    public String getStdnr() {
        return stdnr;
    }

    public void setStdnr(String stdnr) {
        this.stdnr = stdnr;
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
