import java.util.Scanner;

public class TugasDaspro04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenis;
        double jumlah, diskon, harga = 20000, bayar;

        System.out.print("Masukkan jenis buku (Kamus/Novel/Lainnya): ");
        jenis = sc.nextLine();
        System.out.print("Masukkan jumlah pembelian: ");
        jumlah = sc.nextDouble();

        if (jenis.equalsIgnoreCase("kamus")) {
            if (jumlah > 2) {
                diskon = 0.12;
                System.out.println();
            }
        }
    }
}
