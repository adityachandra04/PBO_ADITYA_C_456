public class MainHewan {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        hewan1.nama = "Kucing";
        hewan1.jenis = "Mamalia";
        hewan1.suara = "Nyann~~";

        Hewan hewan2 = new Hewan();
        hewan2.nama = "Anjing";
        hewan2.jenis = "Mamalia";
        hewan2.suara = "Adakah seratus";

        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}