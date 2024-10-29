import java.util.Scanner;

public class Mobil extends Kendaraan {
    private int jumlahKursi;

    public Mobil(String platNomor, String merk, String model, int jumlahKursi) {
        super(platNomor, merk, model);
        this.jumlahKursi = jumlahKursi;
    }

    public static Mobil inputMobil() {
        // try-with-resources -> menutup Scanner secara otomatis
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan Plat Nomor: ");
            String platNomor = scanner.nextLine();
            System.out.print("Masukkan Merk: ");
            String merk = scanner.nextLine();
            System.out.print("Masukkan Model: ");
            String model = scanner.nextLine();
            System.out.print("Masukkan Jumlah Kursi: ");
            int jumlahKursi = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer
            return new Mobil(platNomor, merk, model, jumlahKursi);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Jumlah Kursi: " + jumlahKursi;
    }
}
