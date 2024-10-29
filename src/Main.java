public class Main {
    public static void main(String[] args) {
        // Input Data Pelanggan menggunakan metode inputPelanggan()
        Pelanggan pelanggan = Pelanggan.inputPelanggan();

        // Input Data Kendaraan menggunakan metode inputKendaraan()
        Kendaraan kendaraan = Kendaraan.inputKendaraan();

        // Buat objek RiwayatServis
        RiwayatServis riwayatServis = new RiwayatServis(kendaraan, pelanggan);

        // Input Servis melalui metode inputServis di RiwayatServis
        riwayatServis.inputServis(); 

        // Menampilkan Riwayat Servis
        riwayatServis.tampilkanRiwayat();
    }
}
