import java.util.Scanner;

public class Motor extends Kendaraan {

    public Motor(String platNomor, String merk, String model) {
        super(platNomor, merk, model);
    }

    public static Motor inputMotor() {
        // try-with-resources -> menutup Scanner secara otomatis
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan Plat Nomor: ");
            String platNomor = scanner.nextLine();
            System.out.print("Masukkan Merk: ");
            String merk = scanner.nextLine();
            System.out.print("Masukkan Model: ");
            String model = scanner.nextLine();
            // Menghapus input untuk tipeStang
            return new Motor(platNomor, merk, model);
        }
    }

    @Override
    public String toString() {
        return super.toString();  
    }
}
