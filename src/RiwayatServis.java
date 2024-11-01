import java.util.ArrayList;
import java.util.Scanner;

public class RiwayatServis {
    private Kendaraan kendaraan;
    private Pelanggan pelanggan;
    private ArrayList<Servis> daftarServis;

    // Constructor
    public RiwayatServis(Kendaraan kendaraan, Pelanggan pelanggan) {
        this.kendaraan = kendaraan;
        this.pelanggan = pelanggan;
        this.daftarServis = new ArrayList<>();
    }

    // Getter dan Setter
    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public ArrayList<Servis> getDaftarServis() {
        return daftarServis;
    }

    public void tambahServis(Servis servis) {
        daftarServis.add(servis);
    }

    public void inputServis() {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("\nBerapa layanan servis yang ingin ditambahkan? ");
        int jumlahServis = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < jumlahServis; i++) {
            System.out.print("Layanan Servis (Servis Rutin, Ganti Oli, Mesin, Transmisi, Kaki kaki) " + (i + 1) + ": ");
            String namaServis = scanner.nextLine();
            System.out.print("Masukkan Biaya Servis " + (i + 1) + " : ");
            String inputBiaya = scanner.nextLine();

            double biayaServis;
            if (inputBiaya.equalsIgnoreCase("Gratis") || inputBiaya.equalsIgnoreCase("Free")) {
                biayaServis = 0; // Biaya gratis
            } else {
                biayaServis = Double.parseDouble(inputBiaya);
            }

            tambahServis(new Servis(namaServis, biayaServis));
        }
    }

    public void tampilkanRiwayat() {
        System.out.println("\n=== Riwayat Servis ===");
        System.out.println("Nama: " + pelanggan.getNama());
        System.out.println("Telepon: " + pelanggan.getTelepon()); 
        System.out.println("Kendaraan: " + kendaraan.getMerk() + " " + kendaraan.getModel());
        System.out.println("Nopol: " + kendaraan.getPlatNomor());
        System.out.println("Jumlah Layanan Servis: " + daftarServis.size());

        double totalBiaya = 0;

        for (Servis servis : daftarServis) {
            String biayaOutput;
            if (servis.getBiayaServis() == 0) {
                biayaOutput = "Gratis"; // Jika biaya gratis
            } else {
                biayaOutput = "Rp " + (servis.getBiayaServis() % 1 == 0 ? (int) servis.getBiayaServis() : String.format("%.2f", servis.getBiayaServis())); // Menghilangkan .0
            }
            System.out.println("Nama Servis: " + servis.getNamaServis() + " (" + biayaOutput + ")");
            totalBiaya += servis.getBiayaServis();
        }

        // Menampilkan total biaya tanpa desimal jika bilangan bulat
        System.out.println("Total Biaya: Rp " + (totalBiaya % 1 == 0 ? (int) totalBiaya : String.format("%.2f", totalBiaya)));
    }
}
