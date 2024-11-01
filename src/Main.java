public class Main {
    private static Pelanggan pelanggan;
    private static Kendaraan kendaraan;
    private static RiwayatServis riwayatServis;

    public static void main(String[] args) {
        // Mengambil input data pelanggan
        pelanggan = Pelanggan.inputPelanggan();

        // Input kendaraansdfsdfs
        kendaraan = Kendaraan.inputKendaraan();

        // Buat objek RiwayatServis
        riwayatServis = new RiwayatServis(kendaraan, pelanggan);

        // Input Servis melalui metode inputServis di RiwayatServis
        riwayatServis.inputServis();

        // Menampilkan Riwayat Servis
        riwayatServis.tampilkanRiwayat();
    }
}
