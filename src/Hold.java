public class Hold {
    private String holdnavn;
    private String studerende;
    private String laerer;

    public Hold() {
    }

    public Hold(String holdnavn, String studerende, String laerer) {
        this.holdnavn = holdnavn;
        this.studerende = studerende;
        this.laerer = laerer;
    }

    public String getHoldnavn() {
        return holdnavn;
    }

    public void setHoldnavn(String holdnavn) {
        this.holdnavn = holdnavn;
    }

    public String getStuderende() {
        return studerende;
    }

    public void setStuderende(String studerende) {
        this.studerende = studerende;
    }

    public String getLaerer() {
        return laerer;
    }

    public void setLaerer(String laerer) {
        this.laerer = laerer;
    }
}
