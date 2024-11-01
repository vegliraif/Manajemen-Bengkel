public class Servis {
    private String namaServis;
    private double biayaServis;

    // Constructor
    public Servis(String namaServis, double biayaServis) {
        this.namaServis = namaServis;
        this.biayaServis = biayaServis;
    }

    // Getter
    public String getNamaServis() {
        return namaServis;
    }

    public double getBiayaServis() {
        return biayaServis;
    }

    // Setter
    public void setNamaServis(String namaServis) {
        this.namaServis = namaServis;
    }

    public void setBiayaServis(double biayaServis) {
        this.biayaServis = biayaServis;
    }

    @Override
    public String toString() {
        return namaServis + " (Rp " + (biayaServis % 1 == 0 ? (int) biayaServis : biayaServis) + ")";
    }
}
