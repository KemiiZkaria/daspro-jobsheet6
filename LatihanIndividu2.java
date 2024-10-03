import java.util.Scanner;

public class LatihanIndividu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenis;
        double jumlah, diskon, harga = 20000, bayar, totalDiskon;

        System.out.print("Masukkan jenis buku (Kamus/Novel/Lainnya): ");
        jenis = sc.nextLine();
        System.out.print("Masukkan jumlah pembelian: ");
        jumlah = sc.nextDouble();

        if (jenis.equalsIgnoreCase("kamus")) {
            if (jumlah > 2) {
                diskon = 0.12;
            } else {
                diskon = 0.1;
            }
        } else if (jenis.equalsIgnoreCase("novel")) {
            if (jumlah > 3) {
                diskon = 0.09;
            } else {
                diskon = 0.08;
            }
        } else {
            if (jumlah > 3) {
                diskon = 0.05;
            } else {
                diskon = 0;
            }
        }

        totalDiskon = diskon * jumlah * harga;
        bayar = harga - totalDiskon;

        System.out.println("Total diskon yang anda dapatkan sebesar Rp." + totalDiskon);
        System.out.println("Total harga yang harus anda bayar sebesar Rp." + bayar);
    }
}
