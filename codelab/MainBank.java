public class MainBank {
    public static void main(String[] args) {
        // Membuat objek rekening1
        RekeningBank rekening1 = new RekeningBank();
        rekening1.nomorRekening = "202110370311456";
        rekening1.namaPemilik = "Aditya Chandra";
        rekening1.saldo = 5000000.0; //5.000.000

        // Membuat objek rekening2
        RekeningBank rekening2 = new RekeningBank();
        rekening2.nomorRekening = "201910370311455";
        rekening2.namaPemilik = "Yurdan Gantenk";
        rekening2.saldo = 4000000.0; //4.000.000

        // Menampilkan informasi awal rekening
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Melakukan transaksi setor uang
        rekening1.setorUang(250000.0); //250.000
        rekening2.setorUang(450000.0); //450.000

        // Melakukan transaksi tarik uang
        rekening1.tarikUang(800000.0); //800.000
        rekening2.tarikUang(30000000.0); //30.000.000

        // Menampilkan informasi akhir rekening
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}