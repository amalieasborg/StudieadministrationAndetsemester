public class Lektion {
    private String starttidspunkt;
    private String sluttidspunkt;
    private String hold;
    private String laerer;
    private String studerende;

    public Lektion() {
    }

    public Lektion(String starttidspunkt, String sluttidspunkt, String hold, String laerer, String studerende) {
        this.starttidspunkt = starttidspunkt;
        this.sluttidspunkt = sluttidspunkt;
        this.hold = hold;
        this.laerer = laerer;
        this.studerende = studerende;
    }

    public String getStarttidspunkt() {
        return starttidspunkt;
    }

    public void setStarttidspunkt(String starttidspunkt) {
        this.starttidspunkt = starttidspunkt;
    }

    public String getSluttidspunkt() {
        return sluttidspunkt;
    }

    public void setSluttidspunkt(String sluttidspunkt) {
        this.sluttidspunkt = sluttidspunkt;
    }

    public String getHold() {
        return hold;
    }

    public void setHold(String hold) {
        this.hold = hold;
    }

    public String getLaerer() {
        return laerer;
    }

    public void setLaerer(String laerer) {
        this.laerer = laerer;
    }

    public String getStuderende() {
        return studerende;
    }

    public void setStuderende(String studerende) {
        this.studerende = studerende;
    }
}
