import java.util.Scanner;

public class Pelanggan {
    private String nama;
    private String telepon;

    // Constructor
    public Pelanggan(String nama, String telepon) {
        this.nama = nama;
        this.telepon = telepon;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public static Pelanggan inputPelanggan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Input Data Pelanggan ===");
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Telepon: ");
        String telepon = scanner.nextLine();
        return new Pelanggan(nama, telepon);
    }
}
