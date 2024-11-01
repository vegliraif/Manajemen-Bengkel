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

    // Getter dan Setter
    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static Kendaraan inputKendaraan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Input Data Kendaraan ===");
        System.out.print("Apakah kendaraan berupa (1) Mobil atau (2) Motor? ");
        int pilihanKendaraan = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer setelah nextInt

        if (pilihanKendaraan == 1) {
            return Mobil.inputMobil(scanner); 
        } else {
            return Motor.inputMotor(scanner); 
        }
    }

    @Override
    public String toString() {
        return "Plat Nomor: " + platNomor + ", Merk: " + merk + ", Model: " + model;
    }
}
