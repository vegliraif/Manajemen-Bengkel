import java.util.Scanner;

public class Motor extends Kendaraan {
    public Motor(String platNomor, String merk, String model) {
        super(platNomor, merk, model);
    }

    // Getter dan Setter
    public static Motor inputMotor(Scanner scanner) {
        System.out.print("Masukkan Plat Nomor: ");
        String platNomor = scanner.nextLine();
        System.out.print("Masukkan Merk: ");
        String merk = scanner.nextLine();
        System.out.print("Masukkan Model: ");
        String model = scanner.nextLine();
        return new Motor(platNomor, merk, model);
    }

    @Override
    public String toString() {
        return super.toString();  
    }
}
