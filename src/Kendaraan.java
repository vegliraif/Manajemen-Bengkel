import java.util.Scanner;

public class Kendaraan {
    private String platNomor;
    private String merk;
    private String model;

    // Constructor
    public Kendaraan(String platNomor, String merk, String model) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.model = model;
    }

    // Getter
    public String getPlatNomor() {
        return platNomor;
    }

    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    // Setter
    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static Kendaraan inputKendaraan() {
        // Gtry-with-resources -> menutup Scanner secara otomatis
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("\n=== Input Data Kendaraan ===");
            System.out.print("Apakah kendaraan berupa (1) Mobil atau (2) Motor? ");
            int pilihanKendaraan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer setelah nextInt

            if (pilihanKendaraan == 1) {
                return Mobil.inputMobil(); // Memanggil inputMobil() dari kelas Mobil
            } else {
                return Motor.inputMotor(); // Memanggil inputMotor() dari kelas Motor
            }
        }
    }

    @Override
    public String toString() {
        return "Plat Nomor: " + platNomor + ", Merk: " + merk + ", Model: " + model;
    }
}
