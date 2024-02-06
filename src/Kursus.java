public class Kursus {
    private String kursusnavn;
    private double pris;

    public Kursus() {
    }

    public Kursus(String kursusnavn, double pris) {
        this.kursusnavn = kursusnavn;
        this.pris = pris;
    }

    public String getKursusnavn() {
        return kursusnavn;
    }

    public void setKursusnavn(String kursusnavn) {
        this.kursusnavn = kursusnavn;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }
}
