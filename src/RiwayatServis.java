import java.util.ArrayList;
import java.util.Scanner;

public class RiwayatServis {
    private Kendaraan kendaraan;
    private Pelanggan pelanggan;
    private ArrayList<Servis> daftarServis;
    private Scanner scanner;  // Deklarasi Scanner sebagai atribut kelas

    // Constructor
    public RiwayatServis(Kendaraan kendaraan, Pelanggan pelanggan) {
        this.kendaraan = kendaraan;
        this.pelanggan = pelanggan;
        this.daftarServis = new ArrayList<>();
        this.scanner = new Scanner(System.in); // Inisialisasi Scanner di dalam constructor
    }

    // Getter
    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public ArrayList<Servis> getDaftarServis() {
        return daftarServis;
    }

    // Setter
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public void tambahServis(Servis servis) {
        daftarServis.add(servis);
    }

    // inputServis
    public void inputServis() {
        System.out.print("\nBerapa layanan servis yang ingin ditambahkan? ");
        int jumlahServis = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        for (int i = 0; i < jumlahServis; i++) {
            System.out.print("Masukkan Nama Servis " + (i + 1) + ": ");
            String namaServis = scanner.nextLine();
            System.out.print("Masukkan Biaya Servis " + (i + 1) + ": ");
            double biayaServis = scanner.nextDouble();
            scanner.nextLine(); // Membersihkan buffer
            tambahServis(new Servis(namaServis, biayaServis));
        }
    }

    public void tampilkanRiwayat() {
        System.out.println("Riwayat Servis untuk " + pelanggan.getNama());
        for (Servis servis : daftarServis) {
            System.out.println(servis);
        }
    }

    // menutup Scanner saat program selesai
    public void closeScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
