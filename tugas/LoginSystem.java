import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pilihan login
        System.out.println("P login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline

        if (choice == 1) {
            // Login Admin
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            // Validasi username dan password
            if (username.equals("Admin456") && password.equals("Password456")) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (choice == 2) {
            // Login Mahasiswa
            System.out.print("Masukkan Nama Anda: ");
            String name = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            // Validasi nama dan NIM
            if (name.equals("Aditya Chandra") && nim.equals("202110370311456")) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Name: " + name);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            // Pilihan tidak valid
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}