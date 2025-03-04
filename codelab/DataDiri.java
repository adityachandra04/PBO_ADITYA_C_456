import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class DataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menutup scanner setelah selesai
        scanner.close();

        // Menghitung umur
        int tahunSekarang = Year.now().getValue();
        int umur = tahunSekarang - tahunLahir;

        // Mengkonversi jenis kelamin ke bentuk lengkap
        String jenisKelaminLengkap;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminLengkap = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminLengkap = "Perempuan";
        } else {
            jenisKelaminLengkap = "Tidak Diketahui";
        }

        // Menampilkan output
        System.out.println("\nData Diri:");
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelaminLengkap);
        System.out.println("Umur          : " + umur + " tahun");
    }
}