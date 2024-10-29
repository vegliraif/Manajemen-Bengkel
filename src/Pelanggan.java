import java.util.Scanner;

public class Pelanggan {
    private String nama;
    private String nomorTelepon;

    // Constructor
    public Pelanggan(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public static Pelanggan inputPelanggan() {
        // Gunakan try-with-resources untuk menutup Scanner secara otomatis
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Input Data Pelanggan ===");
            System.out.print("Masukkan Nama Pelanggan: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Nomor Telepon: ");
            String nomorTelepon = scanner.nextLine();
            return new Pelanggan(nama, nomorTelepon);
        }
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Nomor Telepon: " + nomorTelepon;
    }
}
