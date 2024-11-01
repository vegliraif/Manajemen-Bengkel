import java.util.Scanner;

public class Mobil extends Kendaraan {
    private int jumlahKursi;

    public Mobil(String platNomor, String merk, String model) {
        super(platNomor, merk, model);
        // jumlahKursi dihapus sesuai permintaan
    }

    // Getter dan Setter
    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public static Mobil inputMobil(Scanner scanner) {
        System.out.print("Masukkan Plat Nomor: ");
        String platNomor = scanner.nextLine();
        System.out.print("Masukkan Merk: ");
        String merk = scanner.nextLine();
        System.out.print("Masukkan Model: ");
        String model = scanner.nextLine();
        // Jumlah kursi dihapus
        return new Mobil(platNomor, merk, model);
    }

    @Override
    public String toString() {
        return super.toString(); // Mengembalikan hasil dari toString() kelas Kendaraan
    }
}
